package com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.view.View
import android.widget.*
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.airbnb.lottie.LottieAnimationView
import com.rareprob.core_pulgin.R
import com.rareprob.core_pulgin.core.base.CoreBaseActivity
import com.rareprob.core_pulgin.core.base.NetworkUtils
import com.rareprob.core_pulgin.core.base.extention.*
import com.rareprob.core_pulgin.core.utils.AppUtils
import com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.ProductListingData
import com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.PurchaseRestoreState
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.parcel.Parcelize
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@AndroidEntryPoint
class IapBillingPurchaseRestoreActivity : CoreBaseActivity() {

    @Parcelize
    data class Params(
        val defaultLocalPackJson: String = "",
    ) : Parcelable

    private val params: Params by lazy { requireNotNull(intent.getParcelableExtra(PARAMS)) }

    /**
     * Always start this activity as a sub activity
     */
    companion object {
        const val RequestCode = 20000
        private const val PARAMS = "params"
        fun launchForResult(context: Activity, requestCode: Int, params: Params = Params()) {
            context.startActivityForResult(getLaunchIntent(context, params), requestCode)
        }

        private fun getLaunchIntent(context: Context, params: Params): Intent {
            return Intent(context, IapBillingPurchaseRestoreActivity::class.java).apply {
                this.putExtra(PARAMS, params)
                this.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP or Intent.FLAG_ACTIVITY_CLEAR_TOP)
            }
        }
    }

    private val viewModel: IapBillingViewModel by viewModels()
    private lateinit var btnDone: Button
    private lateinit var tvMsg: TextView
    private var productDataList: List<ProductListingData> = emptyList()
    private lateinit var lottieRestoreLoading: LottieAnimationView
    private lateinit var lottieRestoreSuccessful: LottieAnimationView
    private lateinit var lottieRestoreError: LottieAnimationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setFullScreenMode()
        initUi()

        lottieRestoreLoading.postDelayed(Runnable {
            setupDataList()
        }, 1000)
    }


    private fun initUi() {
        setContentView(R.layout.activity_iap_billing_restore_purchase)
        lottieRestoreLoading = findViewById(R.id.lottieLoading)
        lottieRestoreSuccessful = findViewById(R.id.lottieSuccessful)
        lottieRestoreError = findViewById(R.id.lottieError)
        btnDone = findViewById(R.id.btnDone)
        tvMsg = findViewById(R.id.tvMsg)
    }

    private fun setupDataList() {
        if (NetworkUtils.isDeviceOnline(this).not()) {
            runOnUiThread(Runnable {
                showToast(NetworkUtils.NO_NETWORK_MESSAGE)
            })
            return
        } else {
            viewModel.getInAppPacksFromRc(params.defaultLocalPackJson, true)

            lifecycleScope.launch() {
                withContext(Dispatchers.Main) {
                    viewModel.productsForSaleFlows.collect {
                        productDataList = it
                        //Get Already owned products
                        viewModel.getPurchasedItemsList()
                    }
                }
            }

            lifecycleScope.launch() {
                viewModel.isPurchasedRestored.collect {
                    when (it) {
                        PurchaseRestoreState.SUCCESS -> {
                           onSuccessPurchaseRestore()
                        }
                        PurchaseRestoreState.FAIL -> {
                            onFailurePurchaseRestore()
                        }
                    }
                }
            }
        }
    }

    private fun onSuccessPurchaseRestore() {
        runOnUiThread(Runnable {
            btnDone.show()
            btnDone.text = resources.getString(R.string.continue_purchase)
            tvMsg.text = resources.getString(R.string.restore_purchase_success)
            lottieRestoreLoading.hide()
            lottieRestoreError.hide()
            lottieRestoreSuccessful.show()
        })
    }

    private fun onFailurePurchaseRestore() {
        if (NetworkUtils.isDeviceOnline(this).not()) {
            showToast(NetworkUtils.NO_NETWORK_MESSAGE)
            return
        }
        runOnUiThread(Runnable {
            btnDone.show()
            btnDone.text = resources.getString(R.string.go_premium)
            tvMsg.text = resources.getString(R.string.restore_purchase_error)
            lottieRestoreLoading.hide()
            lottieRestoreSuccessful.hide()
            lottieRestoreError.show()
        })
    }


    private fun launchIapBillingActivity() {
        var defaultLocalPackJson = AppUtils.loadJSONFromAsset(
            this, "DefaultRewardVideoPlayerJsonData"
        )
        IapBillingActivity.launchForResult(
            FileManagerMainActivity@ this,
            IapBillingActivity.RequestCode,
            IapBillingActivity.Params(defaultLocalPackJson)
        )
    }


    private fun onSetResult() {
        val intent = Intent()
        setResult(RESULT_OK, intent);
        finish()
    }

    fun onClickBtn(view: View) {
        var btnText = btnDone.text
        if (btnText.equals(resources.getString(R.string.continue_purchase))) {
            onSetResult()
        } else if (btnText.equals(resources.getString(R.string.go_premium))) {
            launchIapBillingActivity()
            finish()
        }
    }

}

