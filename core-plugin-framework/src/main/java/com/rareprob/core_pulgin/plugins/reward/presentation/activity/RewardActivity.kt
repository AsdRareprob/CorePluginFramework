package com.rareprob.core_pulgin.plugins.reward.presentation.activity

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Parcelable
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.viewpager.widget.ViewPager
import com.bumptech.glide.Glide
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.rareprob.core_pulgin.R
import com.rareprob.core_pulgin.core.base.NetworkUtils
import com.rareprob.core_pulgin.databinding.ActivityRefferalBinding
import com.rareprob.core_pulgin.plugins.reward.animation.Coin
import com.rareprob.core_pulgin.plugins.reward.animation.CoinCollectingAnimUtils
import com.rareprob.core_pulgin.plugins.reward.data.local.RewardPreferenceManager
import com.rareprob.core_pulgin.plugins.reward.domain.model.FirebaseRewardData
import com.rareprob.core_pulgin.plugins.reward.domain.model.RewardItem
import com.rareprob.core_pulgin.plugins.reward.presentation.RewardViewModel
import com.rareprob.core_pulgin.plugins.reward.presentation.ViewPagerAdapter
import com.rareprob.core_pulgin.plugins.reward.utils.RewardUtils
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.parcel.Parcelize
import kotlinx.coroutines.*
import javax.inject.Inject


@AndroidEntryPoint
class RewardActivity : RewardBaseActivity(), Runnable {

    private val coinAnimHandler = Handler(Looper.getMainLooper())
    private var coinMaxCount = 15
    private var coinCount = 0
    private lateinit var targetView: LinearLayout
    private lateinit var frmlCoinContainer: FrameLayout
    private var coinAnimInvokeView: View? = null
    lateinit var rewardItem: RewardItem
    private lateinit var tvCoinCount: TextView
    private var totalCoins: Long = 0L
    private var coinInvokeViewLocation = IntArray(2)

    private val mBinding by lazy { ActivityRefferalBinding.inflate(layoutInflater) }
    private var mViewPagerAdapter: ViewPagerAdapter? = null
    private val viewModel: RewardViewModel by viewModels()

//    private lateinit var viewModel: RewardViewModel
//

    @Parcelize
    data class Params(
        val userName: String = "",
        val imagePath: String = ""
    ) : Parcelable

      private val params: Params by lazy { requireNotNull(intent.getParcelableExtra(PARAMS)) }

    /**
     * Always start this activity as a sub activity
     */
    companion object {
        const val RequestCode = 10000
        private const val PARAMS = "params"

        fun launch(context: Activity, params: Params = Params()) {
            context.startActivity(getLaunchIntent(context, params))
        }

        fun launchForResult(context: Activity, requestCode: Int, params: Params = Params()) {
            context.startActivityForResult(getLaunchIntent(context, params), requestCode)
        }

        private fun getLaunchIntent(context: Context, params: Params): Intent {
            return Intent(context, RewardActivity::class.java).apply {
                this.putExtra(PARAMS, params)
                this.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP or Intent.FLAG_ACTIVITY_CLEAR_TOP)
            }
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initUi()
        initDi()
        syncUserRewards()
        setupTabs()
        setListener()
        setProfileInfoData()
    }

    override fun onResume() {
        super.onResume()
        setProfileInfoData()
    }

    //TODO KP remove below code in production
    private fun setProfileInfoData() {
        var username = params.userName
        if (username.isEmpty()) {
            username = "User"
        }

        mBinding.clProfileSection.tvUserName.text = username
        var imagePath = params.imagePath
        if (!TextUtils.isEmpty(imagePath)) {
            Glide.with(this@RewardActivity)
                .load(imagePath)
                .into(mBinding.clProfileSection.ivUserProfile)
        }
    }

    private fun initDi() {
        //viewModel = ViewModelProvider(this).get(RewardViewModel::class.java)
    }

    private fun initUi() {
        setContentView(mBinding.root)
        frmlCoinContainer = mBinding.frmlCoinContainer
        targetView = mBinding.clProfileSection.btnLayout
        tvCoinCount = mBinding.clProfileSection.tvCoinCount
        mBinding.clProfileSection.ivBackIcon.setOnClickListener {
            finish()
        }
        coinAnimHandler.removeCallbacks(this)
        coinAnimHandler.post(this)
    }

    private fun setupTabs() {
        mViewPagerAdapter =
            ViewPagerAdapter(supportFragmentManager, 2, this, ::onClickClaimRewardCallback).apply {
                mBinding.viewPager.adapter = this
            }
        mBinding.viewPager.offscreenPageLimit = 2
        setTab(0)
        mBinding.earnCoins.setOnClickListener {
            mBinding.viewPager.currentItem = 0
            setTab(0)
        }
    }

    private fun setListener() {
        mBinding.exchange.setOnClickListener {
            mBinding.viewPager.currentItem = 1
            /* val user = FirebaseAuth.getInstance().currentUser
             if(user == null){
                 createAnonymousAccountWithReferrerInfo()
             }else {
                 Log.d("@VIBHOR", " deepLink      $user")
                 Toast.makeText(applicationContext,user.uid,Toast.LENGTH_SHORT).show()
             }*/
            setTab(1)
        }

        mBinding.viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {
                setTab(position)
            }

            override fun onPageScrollStateChanged(state: Int) {

            }

        })
    }

    /**
     * Get all coins of user from firebase server
     * and
     * put these coins into shared pref
     * In case of user clear app data or reinstall app
     */
    private fun syncUserRewards() {
        val rewardPreferenceManager = RewardPreferenceManager()
        CoroutineScope(Dispatchers.IO).launch {
            var databaseReference =
                FirebaseDatabase.getInstance()
                    .getReference(RewardUtils.RewardConstant.FirebaseTableName)

            val rewardRef =
                databaseReference.child(RewardUtils.getAndroidId(this@RewardActivity));//.orderByChild("phonenumber")

            val valueEventListener = object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val firebaseRewardData = dataSnapshot.getValue(FirebaseRewardData::class.java)
                    var fbCoins = firebaseRewardData?.earnedCoins?.toLong() ?: 0
                    var localCoins = rewardPreferenceManager.getSavedCoins(this@RewardActivity)
                    if (fbCoins > localCoins) {
                        var updatedTotalCoins = fbCoins
                        rewardPreferenceManager.saveCoins(this@RewardActivity, updatedTotalCoins)
                    }
                    totalCoins = rewardPreferenceManager.getSavedCoins(this@RewardActivity)
                    mBinding.clProfileSection.tvCoinCount.text = totalCoins.toString()
                    if (totalCoins > 0)
                        mBinding.clProfileSection.tvRewardCountMsg.text =
                            "You have $totalCoins coins"
                }

                override fun onCancelled(databaseError: DatabaseError) {
                    Log.d("TAG", databaseError.message)
                }
            }
            rewardRef.addListenerForSingleValueEvent(valueEventListener)
        }
    }

    fun setTab(position: Int) {
        if (position == 0) {
            mBinding.tvEarn.typeface = Typeface.DEFAULT_BOLD
            mBinding.tvEarn.textSize = 16f
            mBinding.ivEarn.setPadding(0, 0, 0, 0)
            mBinding.tvExchange.typeface = Typeface.DEFAULT
            mBinding.tvExchange.textSize = 12f
            mBinding.ivExchange.setPadding(10, 10, 10, 10)
            mBinding.earnIndicator.visibility = View.VISIBLE
            mBinding.exchangeIndicator.visibility = View.INVISIBLE
        } else {
            mBinding.tvEarn.typeface = Typeface.DEFAULT
            mBinding.tvEarn.textSize = 12f
            mBinding.ivEarn.setPadding(10, 10, 10, 10)
            mBinding.tvExchange.typeface = Typeface.DEFAULT_BOLD
            mBinding.tvExchange.textSize = 16f
            mBinding.ivExchange.setPadding(0, 0, 0, 0)
            mBinding.earnIndicator.visibility = View.INVISIBLE
            mBinding.exchangeIndicator.visibility = View.VISIBLE
        }
    }


    override fun run() {
        setupCoinAnim()
    }

    private fun setupCoinAnim() {
        coinAnimInvokeView?.let { addCoinButton ->
            if (coinCount < coinMaxCount) {
                val primaryCoin = Coin.addTo(frmlCoinContainer)
                val secondaryCoin = Coin.addTo(frmlCoinContainer)

                //Calculate start and target coordinates
                primaryCoin.x =
                    coinInvokeViewLocation[0].toFloat() + addCoinButton.width / 6 - 2 * primaryCoin.width
                primaryCoin.y =
                    coinInvokeViewLocation[1].toFloat() - 2 * (addCoinButton.height + primaryCoin.height)

                val targetX: Float =
                    targetView.x + targetView.width / 2 - primaryCoin.width / 2
                val targetY: Float =
                    targetView.y + targetView.height / 2 - primaryCoin.height / 2

                CoinCollectingAnimUtils.animateCoins(
                    frmlCoinContainer,
                    primaryCoin,
                    targetX,
                    targetY,
                    1000f,
                    1000
                )

                secondaryCoin.x =
                    coinInvokeViewLocation[0].toFloat() + addCoinButton.width / 6 - 2 * primaryCoin.width + 50
                secondaryCoin.y =
                    coinInvokeViewLocation[1].toFloat() - 2 * (addCoinButton.height + primaryCoin.height)
                CoinCollectingAnimUtils.animateCoins(
                    frmlCoinContainer,
                    secondaryCoin,
                    targetX,
                    targetY,
                    1000f,
                    1300
                )

                coinAnimHandler.postDelayed(this, 100)
                coinCount++
                updateCoinCount()
            } else coinAnimHandler.removeCallbacks(this)

        }
    }


    private fun updateCoinCount() {
        var loopUntil = totalCoins + rewardItem.rewardCoins
        tvCoinCount.postDelayed({
            if (::rewardItem.isInitialized) {
                lifecycleScope.launch(Dispatchers.IO) {
                    delay(300)
                    for (i in totalCoins until loopUntil) {
                        withContext(Dispatchers.Main) {
                            tvCoinCount.text = (i + 1).toString()
                        }
                    }
                }
                //Update coins in locals
                RewardPreferenceManager().saveCoins(this@RewardActivity, loopUntil)
                if (totalCoins > 0)
                    mBinding.clProfileSection.tvRewardCountMsg.text = "You have $loopUntil coins"
                //claimRewardCoins -> Post coins to firebase server
                viewModel.claimRewardCoins(this@RewardActivity, rewardItem.toEntity())
            }
        }, 500)
    }


    override fun onPause() {
        coinAnimHandler.removeCallbacks(this)
        super.onPause()
    }

    /**
     * We get this callback when Reward Item is clicked from recycler View of EarnCoinFragment
     */
    private fun onClickClaimRewardCallback(rewardItem: RewardItem, view: View) {
        if(NetworkUtils.isDeviceOnline(this).not()){
            Toast.makeText(this@RewardActivity,getString(R.string.no_network_message), Toast.LENGTH_SHORT).show()
            return
        }

        view.getLocationOnScreen(coinInvokeViewLocation)
        coinAnimInvokeView = view
        this.rewardItem = rewardItem

        coinMaxCount = 15//Random.nextInt(1, 50)
        coinCount = 0
        coinAnimHandler.removeCallbacks(this)
        coinAnimHandler.post(this)
        Log.d("callbackListener", "callbackListener")


    }

//    fun isDeviceOnline(context: Context?): Boolean {
//        if (context != null) {
//            val connMgr =
//                context.getSystemService(AppCompatActivity.CONNECTIVITY_SERVICE) as ConnectivityManager
//            val networkInfo = connMgr.activeNetworkInfo
//            return networkInfo != null && networkInfo.isConnected
//        }
//        return true
//    }

}