package com.rareprob.core_pulgin.plugins.reward.presentation.adapter

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import com.rareprob.core_pulgin.R
import com.rareprob.core_pulgin.core.base.NetworkUtils
import com.rareprob.core_pulgin.core.base.data.AppData
import com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem
import  com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils.RewardViewType.EarnCoinViewType
import kotlinx.android.synthetic.main.earn_coin_item_view.view.*

class EarnCoinAdapter(
    private val context: Context?,
    private var dataList: List<AppData> = emptyList(),
    var onClickEarnCoin: (RewardItem, View) -> Unit,
    var onClickClaimCoin: (RewardItem, View) -> Unit
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun getItemViewType(position: Int): Int {
        return if (position == 0) {
            EarnCoinViewType.TASK_LABEL
        } else {
            EarnCoinViewType.ITEM
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == EarnCoinViewType.TASK_LABEL) {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.task_item_view, parent, false)
            TaskVH(view)
        } else {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.earn_coin_item_view, parent, false)
            RewardItemVH(view)
        }

    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    fun invalidateAdapter(notifyingDataList: List<AppData>) {
        dataList = notifyingDataList
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var dataItem = dataList[position]

        when (holder) {
            is RewardItemVH -> {
                holder.bindItems(dataItem)
            }
            is TaskVH -> {
                holder.bindItems(dataItem)
            }
        }
    }


    inner class RewardItemVH(view: View) : RecyclerView.ViewHolder(view) {
        var taskIcon: ImageView = view.findViewById(R.id.icon)
        var tvRewardTitle: TextView = view.findViewById(R.id.tvRewardTitle)
        var ivRewardIcon: ImageView = view.findViewById(R.id.ivRewardIcon)
        var tvRewardCount: TextView = view.findViewById(R.id.tvRewardCount)
        var tvActionBtn: TextView = view.findViewById(R.id.tvActionBtn)
        var tvClaimBtn: TextView = view.findViewById(R.id.tvClaimBtn)


        fun bindItems(dataItem: AppData) {
            if (dataItem is RewardItem) {
                var rewardItem = dataItem as RewardItem

                var taskIconBgColor = rewardItem.taskIconBgColor.ifEmpty {
                    "#FFA8A8"
                }
                taskIcon.background.setColorFilter(
                    Color.parseColor(taskIconBgColor), PorterDuff.Mode.SRC_ATOP
                )
                tvRewardTitle.text = rewardItem.title
                tvRewardCount.text = "+ " + rewardItem.rewardCoins.toString()
                tvActionBtn.text = rewardItem.actionButtonCaption

                var ctaBgColor = rewardItem.ctaBgColor.ifEmpty {
                    "#08C792"
                }
                tvActionBtn.background.setColorFilter(
                    Color.parseColor(ctaBgColor), PorterDuff.Mode.SRC_ATOP
                )

                loadBitmap(rewardItem = rewardItem)

                if (rewardItem.taskCompletionStatus) {
                    tvClaimBtn.visibility = View.VISIBLE
                    tvActionBtn.visibility = View.GONE
                } else {
                    tvClaimBtn.visibility = View.GONE
                    tvActionBtn.visibility = View.VISIBLE
                }

                setClaimStatusView(dataItem)

                tvActionBtn.setOnClickListener {
                    onClickEarnCoin(rewardItem, it)
                }

                tvClaimBtn.setOnClickListener {
                    context?.let { context ->
                        if (NetworkUtils.isDeviceOnline(context).not()) {
                            Toast.makeText(
                                context,
                                "Please check your internet conection",
                                Toast.LENGTH_SHORT
                            ).show()
                        } else {
                            //To Block click .We have applied this check if (rewardItem.isRewardClaimed.not())
                            if (rewardItem.isRewardClaimed.not()) {
                                onClickClaimCoin(rewardItem, it)
                            }
                        }
                    }
                }
            }
        }

        private fun setClaimStatusView(rewardItem: RewardItem) {
            if (rewardItem.taskCompletionStatus) {
                if (rewardItem.isRewardClaimed) {
                    itemView.apply {
                        tvClaimBtn.text = "Claimed"
                        alpha = .3f
                    }
                } else {
                    tvClaimBtn.text = "Claim"
                }
            }
        }

        private fun loadBitmap(rewardItem: RewardItem) {
            if (context != null) {
                Glide.with(context).asBitmap().load(rewardItem.taskIcon).thumbnail(0.1f)
                    .into(object : CustomTarget<Bitmap?>() {
                        override fun onLoadFailed(errorDrawable: Drawable?) {
                            super.onLoadFailed(errorDrawable)
                            taskIcon?.setImageResource(R.drawable.ic_video_play)
                        }

                        override fun onResourceReady(
                            resource: Bitmap, transition: Transition<in Bitmap?>?
                        ) {
                            taskIcon.icon?.setImageBitmap(resource)
                        }

                        override fun onLoadCleared(placeholder: Drawable?) {
                        }
                    })

                Glide.with(context).asBitmap().load(rewardItem.rewardIcon).thumbnail(0.1f)
                    .into(object : CustomTarget<Bitmap?>() {
                        override fun onLoadFailed(errorDrawable: Drawable?) {
                            super.onLoadFailed(errorDrawable)
                            taskIcon.setImageResource(R.drawable.ic_star)
                        }

                        override fun onResourceReady(
                            resource: Bitmap, transition: Transition<in Bitmap?>?
                        ) {
                            ivRewardIcon?.setImageBitmap(resource)
                        }

                        override fun onLoadCleared(placeholder: Drawable?) {
                        }
                    })
            }
        }
    }

    inner class TaskVH(view: View) : RecyclerView.ViewHolder(view) {
        var tvRewardName: TextView = view.findViewById(R.id.tvRewardName)

        fun bindItems(dataItem: AppData) {
            tvRewardName.text = dataItem.data.toString()
        }


    }


}