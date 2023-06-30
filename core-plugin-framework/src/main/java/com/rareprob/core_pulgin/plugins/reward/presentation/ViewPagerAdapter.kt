package com.rareprob.core_pulgin.plugins.reward.presentation

import android.content.Context
import android.os.Parcelable
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem
import com.rareprob.core_pulgin.plugins.reward.presentation.fragment.CoinExchangeFragment
import com.rareprob.core_pulgin.plugins.reward.presentation.fragment.EarnCoinFragment

class ViewPagerAdapter(
    fm: FragmentManager,
    private var mNumOfTabs: Int,
    var mContext: Context,
    var activityCallbackListener: (RewardItem, View) -> Unit
) : FragmentStatePagerAdapter(fm) {
    private var fragments: Array<Fragment?> = arrayOfNulls(mNumOfTabs)

    override fun getItem(position: Int): Fragment {

        return if (position == 0) {
            var frag = EarnCoinFragment.newInstance(null)
            frag.setActivityCallbackListener(activityCallbackListener)
            return frag
        } else {
            CoinExchangeFragment.newInstance(null)
        }
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val createdFragment = super.instantiateItem(container, position) as Fragment
        fragments[position] = createdFragment
        return createdFragment
    }

    override fun saveState(): Parcelable? {
        return null
    }

    override fun getCount(): Int {
        return mNumOfTabs
    }
}