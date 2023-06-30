package com.rareprob.core_pulgin.plugins.reward.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.Toast
import androidx.fragment.app.viewModels
//import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rareprob.core_pulgin.R
//import com.example.cleanmaster.ApkViewModel
//import com.example.cleanmaster.CleanMasterMainActivity
import com.rareprob.core_pulgin.core.base.data.AppData
import com.rareprob.core_pulgin.plugins.reward.presentation.adapter.CoinExchangeAdapter
import com.rareprob.core_pulgin.plugins.reward.presentation.RewardViewModel
//import dagger.hilt.android.AndroidEntryPoint
import java.util.ArrayList
import com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils.RewardViewType.CoinExchangeViewType

class CoinExchangeFragment : RewardBaseFragment(),
    CoinExchangeAdapter.ItemCallbackListener {

    // private val viewModel by viewModels<ReferralViewModel>()
    private lateinit var recyclerView: RecyclerView
    private val viewModel by viewModels<RewardViewModel>()
    private lateinit var loadingProgressbar: ProgressBar


    companion object {
        fun newInstance(args: Bundle?): CoinExchangeFragment {
            val fragment = CoinExchangeFragment()
            var bundle = args
            if (bundle == null)
                bundle = Bundle()
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        viewModel = ViewModelProvider(this).get(RewardViewModel::class.java)
        return inflater.inflate(R.layout.fragment_reward_coin_exchange, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.rcvCoinExchange)
        loadingProgressbar = view.findViewById(R.id.loadingProgressbar)
        setAdapter()
    }


    private fun getDataList(): ArrayList<AppData> {
        val dataList = ArrayList<AppData>()
        var premiumCardData = AppData(CoinExchangeViewType.PREMIUM)
        dataList.add((premiumCardData))

//        var themeCardData = AppData(CoinExchangeViewType.PALLTONE_THEME)
//        dataList.add((themeCardData))
//
//        var musicLyricsCardData = AppData(CoinExchangeViewType.MUSIC_LYRICS)
//        dataList.add((musicLyricsCardData))

        var musicThemeCardData = AppData(CoinExchangeViewType.MUSIC_THEME)
        dataList.add((musicThemeCardData))

        return dataList
    }

    private fun setAdapter() {
        val dataList = getDataList()
        if (activity == null || ::loadingProgressbar.isInitialized.not() || ::loadingProgressbar.isInitialized.not()) {
            Toast.makeText(
                activity,
                "Something went wrong. Please try again later",
                Toast.LENGTH_SHORT
            ).show()
            return
        }
        recyclerView?.apply {
            adapter = CoinExchangeAdapter(context, dataList, this@CoinExchangeFragment)
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        }

        loadingProgressbar.visibility = View.GONE
    }

}