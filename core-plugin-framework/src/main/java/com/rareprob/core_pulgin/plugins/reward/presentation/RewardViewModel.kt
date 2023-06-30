package com.rareprob.core_pulgin.plugins.reward.presentation

import android.app.Activity
import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rareprob.core_pulgin.core.utils.Resource
import com.rareprob.core_pulgin.plugins.reward.data.local.RewardDao
import com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity
import com.rareprob.core_pulgin.plugins.reward.data.local.RewardRoomDatabase
import com.rareprob.core_pulgin.plugins.reward.domain.model.ReferralData
import com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem
import com.rareprob.core_pulgin.plugins.reward.data.repository.RewardRepositoryImpl
import com.rareprob.core_pulgin.plugins.reward.domain.model.ThemeData
import com.rareprob.core_pulgin.plugins.reward.domain.use_case.RewardUseCase
import com.rareprob.core_pulgin.plugins.reward.domain.use_case.ThemeUseCase
import com.rareprob.core_pulgin.plugins.reward.presentation.state.RewardState
import com.rareprob.core_pulgin.plugins.reward.presentation.state.ThemeDataState
//import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

//import javax.inject.Inject

//@HiltViewModel
//class ReferralViewModel @Inject constructor(
class RewardViewModel(
    // private val remoteConfigInstance: FirebaseRemoteConfig
) : ViewModel() {

//    private val coroutineExceptionHandler = CoroutineExceptionHandler { context, exception ->
//        println("Exception thrown somewhere within parent or child: $exception.")
//    }
//
//    /**
//     * This is the job for all coroutines started by this ViewModel.
//     * Cancelling this job will cancel all coroutines started by this ViewModel.
//     */
//    private val supervisorJob = SupervisorJob()
//
//    /**
//     * This is the main scope for all coroutines launched by MainViewModel.
//     * Since we pass viewModelJob, you can cancel all coroutines
//     * launched by uiScope by calling viewModelJob.cancel()
//     */
//    val coroutineScope = CoroutineScope(Dispatchers.Default + supervisorJob + coroutineExceptionHandler)
//
//    /**
//     * Cancel all coroutines when the ViewModel is cleared
//     */
//    override fun onCleared() {
//        super.onCleared()
//        supervisorJob.cancel()
//    }


    private val _referralState = MutableStateFlow(RewardState())
    val referralState = _referralState.asStateFlow()


    private val _eventFlow = MutableSharedFlow<UIEvent>()
    val eventFlow = _eventFlow.asSharedFlow()

    fun getRewardItems(rcKey: String,context: Context?) {
        viewModelScope.launch(Dispatchers.IO) {
            RewardUseCase(RewardRepositoryImpl()).getData(rcKey,context).collect { result ->
                when (result) {
                    is Resource.Success -> {
                        _eventFlow.emit(
                            UIEvent.HideLoader(
                                result.message ?: "Hide Loading"
                            )
                        )
                        _referralState.value =
                            prepareReferralState(result = result, isLoading = false)
                    }
                    is Resource.Error -> {
                        _referralState.value =
                            prepareReferralState(result = result, isLoading = false)
                        _eventFlow.emit(
                            UIEvent.ShowSnackbar(
                                result.message ?: "Unknown error"
                            )
                        )
                    }
                    is Resource.Loading -> {
                        _referralState.value =
                            prepareReferralState(result = result, isLoading = true)

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
            ThemeUseCase(RewardRepositoryImpl()).getData(rcKey,context).collect { result ->
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
            RewardRepositoryImpl().claimRewardCoins(context, rewardData)
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
            RewardRepositoryImpl().onRedeemRewardCoins(context,redeemedCoin)
        }
    }

    private fun prepareReferralState(
        result: Resource<List<ReferralData>>,
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

    fun persistRewardsToDb(
        rewardDataList: List<RewardItem>,
        context: Activity?,
        onValidateListCallback: () -> Unit
    ) {
        context?.let {
            viewModelScope.launch(Dispatchers.IO) {
                var rewardDao: RewardDao =
                    RewardRoomDatabase.getDatabase(context?.applicationContext).rewardDao()
                rewardDao.insertAll(rewardDataList.map {
                    it.toEntity()
                })
                var rewardDataUpdated = rewardDao.getRewards()
                Log.d("rewardDataUpdated", "$rewardDataUpdated")

                withContext(Dispatchers.Main) {
                    onValidateListCallback()
                }
            }
        }
    }


    sealed class UIEvent {
        data class ShowSnackbar(val message: String) : UIEvent()
        data class ShowLoader(val message: String) : UIEvent()
        data class HideLoader(val message: String) : UIEvent()
    }
}