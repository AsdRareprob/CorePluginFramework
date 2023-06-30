package com.rareprob.core_pulgin.plugins.reward.presentation.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.rareprob.core_pulgin.R
import com.rareprob.core_pulgin.core.base.data.AppData
import com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils.RewardViewType.CoinExchangeViewType

class CoinExchangeAdapter(
    private val context: Context,
    private var dataList: List<AppData>,
    var itemCallbackListener: ItemCallbackListener

) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    interface ItemCallbackListener {
    }

    @NonNull
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return getViewHolder(parent, viewType)
    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        when (viewHolder) {
            is PremiumViewHolder -> {
                bindPremiumDataToViews(viewHolder, position)
            }
            is PalltoneThemeViewHolder -> {
                bindPalltoneThemeDataToViews(viewHolder, position)
            }
            is MusicLyricsViewHolder -> {
                bindMusicLyricsDataToViews(viewHolder, position)
            }
            is MusicThemeCardViewHolder -> {
                bindMusicThemeDataToViews(viewHolder, position)
            }
        }
    }

    private fun bindMusicThemeDataToViews(
        viewHolder: MusicThemeCardViewHolder,
        position: Int
    ) {
        val dataItem = dataList[position]
        viewHolder.llExchangeMusicThemeReward.setOnClickListener {
            navigateToMusicThemeScreen()
        }

    }

    private fun bindMusicLyricsDataToViews(
        viewHolder: MusicLyricsViewHolder,
        position: Int
    ) {
        val dataItem = dataList[position]
    }

    private fun bindPalltoneThemeDataToViews(
        viewHolder: PalltoneThemeViewHolder,
        position: Int
    ) {
        val dataItem = dataList[position]
    }

    private fun bindPremiumDataToViews(
        viewHolder: PremiumViewHolder,
        position: Int
    ) {
        val dataItem = dataList[position]
        viewHolder.llExchangePremiumReward.setOnClickListener {
            navigateToThemeScreen()
        }
    }

    private fun navigateToThemeScreen() {
        try {
            val intent = Intent(
                context,
                Class.forName(context.resources.getString(R.string.video_player_premium_theme_component))
            )
            intent.putExtra("NAVIGATION_SOURCE", "REWARD_LIB")
            intent.putExtra("THEME_TYPE", "PREMIUM")
            context.startActivity(intent)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
            context.startActivity(intent)
            //finish()
        } catch (_: Exception) {
            Toast.makeText(
                context,
                "Something went wrong.Please try again later",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun navigateToMusicThemeScreen() {
        try {
            val intent = Intent(
                context,
                Class.forName(context.resources.getString(R.string.video_player_music_theme_component))
            )
            intent.putExtra("OPEN_PLAYER_SCREEN", false)
            context.startActivity(intent)
        } catch (_: Exception) {
            Toast.makeText(
                context,
                "Something went wrong.Please try again later",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun getViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            CoinExchangeViewType.PREMIUM -> {
                PremiumViewHolder(
                    inflateView(parent, R.layout.view_item_reward_coin_exchange_premium_theme_card)
                )
            }
            CoinExchangeViewType.PALLTONE_THEME -> {
                PalltoneThemeViewHolder(
                    inflateView(parent, R.layout.view_item_reward_coin_exchange_premium_theme_card)
                )
            }
            CoinExchangeViewType.MUSIC_LYRICS -> {
                MusicLyricsViewHolder(
                    inflateView(parent, R.layout.view_item_reward_coin_exchange_premium_theme_card)
                )
            }
            CoinExchangeViewType.MUSIC_THEME -> {
                MusicThemeCardViewHolder(
                    inflateView(parent, R.layout.view_item_reward_music_theme_card)
                )
            }
            else -> {
                InvalidFallbackViewHolder(
                    inflateView(parent, R.layout.view_item_invalid_card_fallback)
                )
            }
        }
    }

    private fun inflateView(parent: ViewGroup, layoutId: Int): View {
        return LayoutInflater.from(parent.context)
            .inflate(layoutId, parent, false)
    }

    private fun bindDataToViews(viewHolder: RecyclerView.ViewHolder, position: Int) {

    }

    override fun getItemViewType(position: Int): Int {
        return dataList[position].viewType
    }

//    private fun setClickListener(
//        holder: IapBillingViewHolder,
//        iapItem: ProductListingData,
//        position: Int
//    ) {
//
//        holder.itemView.setOnClickListener {
//            onClickViewItem(position, iapItem)
//        }
//    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    fun onClickViewItem(position: Int) {
//        dataList.forEach {
//            if (it != iapItem)
//                it.isSelected = false
//        }
//        iapItem.isSelected = !iapItem.isSelected
//        // notifyItemChanged(position)
//        notifyDataSetChanged()
//        itemCallbackListener.togglePurchaseBtn(iapItem.isSelected)
    }


    inner class PremiumViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var llExchangePremiumReward: LinearLayout = view.findViewById(R.id.llExchangePremiumReward)
//        var clParent: ConstraintLayout = view.findViewById(R.id.clParent)
//        var radioButton: RadioButton = view.findViewById(R.id.radioButton)
//        var tvPackName: TextView = view.findViewById(R.id.tvPackName)
//        var tvValidity: TextView = view.findViewById(R.id.tvValidity)
//        var tvRecommended: TextView = view.findViewById(R.id.tvRecommended)
//        var tvShowPrice: TextView = view.findViewById(R.id.tvPrice)
//        var tvStrikeThroughPrice: TextView = view.findViewById(R.id.tvStrikeThroughPrice)
    }

    inner class PalltoneThemeViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

    inner class MusicLyricsViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

    inner class MusicThemeCardViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var llExchangeMusicThemeReward: LinearLayout =
            view.findViewById(R.id.llExchangeMusicThemeReward)

    }


}