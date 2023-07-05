package com.rareprob.core_pulgin.plugins.reward.presentation

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rareprob.core_pulgin.core.utils.Resource
import com.rareprob.core_pulgin.plugins.reward.data.local.RewardDao
import com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity
import com.rareprob.core_pulgin.plugins.reward.data.local.RewardDatabase
import com.rareprob.core_pulgin.plugins.reward.domain.model.RewardData
import com.rareprob.core_pulgin.plugins.reward.domain.model.ThemeData
import com.rareprob.core_pulgin.plugins.reward.domain.use_case.RewardUseCase
import com.rareprob.core_pulgin.plugins.reward.domain.use_case.ThemeUseCase
import com.rareprob.core_pulgin.plugins.reward.presentation.state.RewardState
import com.rareprob.core_pulgin.plugins.reward.presentation.state.ThemeDataState
import dagger.hilt.android.lifecycle.HiltViewModel
//import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import javax.inject.Inject


@HiltViewModel
class RewardViewModel @Inject constructor(
     private val rewardUseCase: RewardUseCase,
     private val themeUseCase: ThemeUseCase,
     private val db: RewardDatabase
) : ViewModel() {

    private val _rewardState = MutableStateFlow(RewardState())
    val rewardState = _rewardState.asStateFlow()

    private val _eventFlow = MutableSharedFlow<UIEvent>()
    val eventFlow = _eventFlow.asSharedFlow()

    fun getRewardItems(context: Context?) {
        viewModelScope.launch(Dispatchers.IO) {
            rewardUseCase.getData(context).collect { result ->
                when (result) {
                    is Resource.Success -> {
                        _eventFlow.emit(
                            UIEvent.HideLoader(
                                result.message ?: "Hide Loading"
                            )
                        )
                        _rewardState.value =
                            prepareRewardState(result = result, isLoading = false)
                    }
                    is Resource.Error -> {
                        _rewardState.value =
                            prepareRewardState(result = result, isLoading = false)
                        _eventFlow.emit(
                            UIEvent.ShowSnackbar(
                                result.message ?: "Unknown error"
                            )
                        )
                    }
                    is Resource.Loading -> {
                        _rewardState.value =
                            prepareRewardState(result = result, isLoading = true)

                        _eventFlow.emit(
                            UIEvent.ShowLoader(
                                result.message ?: "Show Loading"
                            )
                        )

                    }
                }

            }
        }
    }

    private val _themeState = MutableStateFlow(ThemeDataState())
    val themeState = _themeState.asStateFlow()
    fun getThemeData(rcKey: String,context: Context?) {
        viewModelScope.launch(Dispatchers.IO) {
            themeUseCase.getData(rcKey,context).collect { result ->
                when (result) {
                    is Resource.Success -> {
                        _themeState.value =
                            prepareThemeState(result = result, isLoading = false)
                    }
                    is Resource.Error -> {
                        _themeState.value =
                            prepareThemeState(result = result, isLoading = false)
                        _eventFlow.emit(
                            UIEvent.ShowSnackbar(
                                result.message ?: "Unknown error"
                            )
                        )
                    }
                    is Resource.Loading -> {
                        _themeState.value =
                            prepareThemeState(result = result, isLoading = true)
                    }
                }
            }
        }
    }
    fun claimRewardCoins(context: Context, rewardData: RewardEntity) {
        viewModelScope.launch(Dispatchers.IO) {
            rewardUseCase.claimRewardCoins(context, rewardData)
        }
    }

    /**
     * When user redeems coin, we need to perform following actions
     * 1. Reduce a particular theme associated coin from total coins
     * 2. Post remaining coins to firebase server
     * 3.Update remaining coins as total coins in local
     */
    fun onRedeemRewardCoins(context: Context, redeemedCoin: Long) {
        viewModelScope.launch(Dispatchers.IO) {
            rewardUseCase.onRedeemRewardCoins(context,redeemedCoin)
        }
    }

    private fun prepareRewardState(
        result: Resource<List<RewardData>>,
        isLoading: Boolean
    ): RewardState {
        return RewardState(
            result.data ?: emptyList(),
            isLoading = isLoading

        )
    }

    private fun prepareThemeState(
        result: Resource<Map<Long, ThemeData>>,
        isLoading: Boolean
    ): ThemeDataState {
        return ThemeDataState(
            result.data ?: emptyMap(),
            isLoading = isLoading

        )
    }

    fun getCompletedTasks(): Map<String, RewardEntity> {
        var rewardDao: RewardDao =
            db.rewardDao
        var rewardDataList = rewardDao.getCompletedRewardTask()

        var completedTaskMap = emptyMap<String, RewardEntity>()
        completedTaskMap = rewardDataList.associateBy {
            it.rewardType
        }
        return completedTaskMap
    }

    sealed class UIEvent {
        data class ShowSnackbar(val message: String) : UIEvent()
        data class ShowLoader(val message: String) : UIEvent()
        data class HideLoader(val message: String) : UIEvent()
    }
}