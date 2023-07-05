package com.rareprob.core_pulgin.plugins.reward.presentation.fragment

import android.view.View
import android.widget.ProgressBar
import androidx.fragment.app.Fragment

abstract class RewardBaseFragment () : Fragment() {

    fun showProgressbar(progressBar: ProgressBar){
        progressBar.visibility = View.VISIBLE
    }

    fun hideProgressbar(progressBar: ProgressBar){
        progressBar.visibility = View.GONE

    }
}