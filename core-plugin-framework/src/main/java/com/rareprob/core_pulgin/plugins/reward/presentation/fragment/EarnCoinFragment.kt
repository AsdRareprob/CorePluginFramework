package com.rareprob.core_pulgin.plugins.reward.presentation.fragment

import android.content.Intent
import android.os.Bundle
import android.os.Environment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity
import com.rareprob.core_pulgin.core.base.data.AppData
import com.rareprob.core_pulgin.databinding.EarnCoinFragmentBinding
import com.rareprob.core_pulgin.plugins.reward.domain.model.RewardData
import com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem
import com.rareprob.core_pulgin.plugins.reward.presentation.adapter.EarnCoinAdapter
import com.rareprob.core_pulgin.plugins.reward.presentation.RewardViewModel
import com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils.RewardViewType.EarnCoinViewType
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.withContext

@AndroidEntryPoint
class EarnCoinFragment : RewardBaseFragment() {

    private val mBinding by lazy { EarnCoinFragmentBinding.inflate(layoutInflater) }
    private lateinit var mEarnCoinAdapter: EarnCoinAdapter
    private val viewModel by viewModels<RewardViewModel>()
    private lateinit var activityCallback: (RewardItem, View) -> Unit

    companion object {
        fun newInstance(args: Bundle?): EarnCoinFragment {
            val fragment = EarnCoinFragment()
            var bundle = args
            if (bundle == null)
                bundle = Bundle()
            fragment.arguments = bundle
            return fragment
        }
    }

    fun setActivityCallbackListener(activityCallbackListener1: (RewardItem, View) -> Unit) {
        this.activityCallback = activityCallbackListener1
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mEarnCoinAdapter =
            EarnCoinAdapter(activity, ArrayList(), ::onClickEarnCoin, ::onClickClaimCoin).apply {
                mBinding.recyclerview.adapter = this
            }
        getRewardItems()
        return mBinding.root
    }


    /**
     * TODO : Data fetch code
     */
    private fun getRewardItems() {
        lifecycleScope.launch {
            viewModel.getRewardItems(context)
            viewModel.rewardState.collect {
                if (it.isLoading) {
                    //Show Loader
                } else if (it.referralItems.isEmpty().not()) {
                    setupDataList(it.referralItems)
                }
            }
        }
        handleUiEvents()
    }

    private fun handleUiEvents() {
        lifecycleScope.launch {
            viewModel.eventFlow.collectLatest { event ->
                when (event) {
                    is RewardViewModel.UIEvent.ShowLoader -> {
                        showProgressbar(mBinding.loadingProgressbar)
                    }
                    is RewardViewModel.UIEvent.HideLoader -> {
                        hideProgressbar(mBinding.loadingProgressbar)
                    }
                    is RewardViewModel.UIEvent.ShowSnackbar -> {
                    }
                }
            }
        }
    }

    private var taskName = ""
    private val dataList = ArrayList<AppData>()
    private fun setupDataList(referralItems: List<RewardData> = emptyList()) {
        hideProgressbar(mBinding.loadingProgressbar)

        //Right now we have items at o position only:change logic later on
        var referralData = referralItems[0]

        var rewardNameData = AppData(EarnCoinViewType.TASK_LABEL)
        rewardNameData.data = referralData.rewardName
        dataList.add((rewardNameData))

        taskName = referralData.rewardName
        var rewardItems = referralData.rewardItems
        rewardItems.map {
            it.viewType = EarnCoinViewType.ITEM
        }
        dataList.addAll(rewardItems)
        notifyAdapter(dataList)
    }

    private fun notifyAdapter(dataList: ArrayList<AppData>) {
        mEarnCoinAdapter.invalidateAdapter(dataList)
    }

    private fun onClickClaimCoin(rewardItem: RewardItem, view: View) {
        if (activity == null || rewardItem.isRewardClaimed) {
            return
        }
        rewardItem.isRewardClaimed = true
        //Changing sort order to list.size +1 to move this item to last position
        rewardItem.sortSequence = dataList.size + 1
        activityCallback(rewardItem, view)
        updateAdapter(view)
    }

    /**
     * We rearrange Adapter ui once user claims coins
     * We place Claimed reward to bottom of list
     */
    private fun updateAdapter(view: View) {
        view.postDelayed({
            lifecycleScope.launch(Dispatchers.IO) {
                var updatedDataList = ArrayList<RewardItem>()
                var taskLabelName = ""

                dataList.mapIndexed { index, appData ->
                    if (appData.viewType == EarnCoinViewType.TASK_LABEL) {
                        taskLabelName = appData.data.toString()
                    } else if (appData.viewType == EarnCoinViewType.ITEM) {
                        var rewardData = appData as RewardItem
                        updatedDataList.add(rewardData)
                    }
                }

                var sortedList = updatedDataList.sortedBy { rewardItem ->
                    rewardItem.sortSequence
                }
                dataList.clear()
                var rewardNameData = AppData(EarnCoinViewType.TASK_LABEL)
                rewardNameData.data = taskLabelName
                dataList.add((rewardNameData))
                dataList.addAll(sortedList)
                withContext(Dispatchers.Main) {
                    notifyAdapter(dataList)
                }
            }
        }, 1500)
    }

    /**
     * Called when we click any task item to earn coin
     * OnClicking of item user will be navigated to a particular screen
     */
    private fun onClickEarnCoin(rewardItem: RewardItem, view: View) {
        if (activity == null) {
            return
        }
        var actionIntent = context?.let {
            RewardUtils.getAppSpecificLaunchScreenActionIntent(
                it,
                activity?.packageName
                    ?: "",
                rewardItem
            )
        }
        if (actionIntent == null) {
            showErrorMsg()
            return
        }
        try {
            val intent = Intent(actionIntent)
            activity?.startActivity(intent)
        } catch (exception: Exception) {
            showErrorMsg()
        }
    }


    private fun showErrorMsg() {
        Toast.makeText(
            activity,
            "Something went wrong. Please try again later",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onResume() {
        super.onResume()
        invalidateUi()
    }

    private fun invalidateUi() {
        if (dataList.isEmpty())
            return

        var appContext = activity?.applicationContext
        appContext?.let {
            lifecycleScope.launch(Dispatchers.IO) {
                var sortedRewardTaskList = viewModel.getSortedRewardTaskByCompletionStatus()
                if (sortedRewardTaskList.isNotEmpty()) {
                    var rewardNameData = AppData(EarnCoinViewType.TASK_LABEL)
                    rewardNameData.data = taskName
                    if (dataList.isNotEmpty()) {
                        dataList.clear()
                    }

                    dataList.add((rewardNameData))

                    sortedRewardTaskList.map {
                        it.viewType = EarnCoinViewType.ITEM
                    }
                    dataList.addAll(sortedRewardTaskList)
                    withContext(Dispatchers.Main) {
                        notifyAdapter(dataList)
                    }
                }
            }
        }
    }
}