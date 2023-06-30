package com.rareprob.core_pulgin.plugins.payment.in_app_purchase.presentation

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.view.View
import android.view.View.OnClickListener
import android.widget.*
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rareprob.core_pulgin.R
import com.rareprob.core_pulgin.core.base.CoreBaseActivity
import com.rareprob.core_pulgin.core.base.extention.FONT
import com.rareprob.core_pulgin.core.base.extention.setTextFont
import com.rareprob.core_pulgin.core.base.extention.show
import com.rareprob.core_pulgin.plugins.payment.FeatureInfo
import com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.InAppProductData
import com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.ProductListingData
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.parcel.Parcelize
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@AndroidEntryPoint
class IapBillingActivity : CoreBaseActivity(), OnClickListener,
    IapBillingAdapter.ItemCallbackListener {

    @Parcelize
    data class Params(
        val defaultLocalPackJson: String = "",
    ) : Parcelable

    private val params: Params by lazy { requireNotNull(intent.getParcelableExtra(PARAMS)) }

    /**
     * Always start this activity as a sub activity
     */
    companion object {
        const val RequestCode = 10000
        private const val PARAMS = "params"
        fun launchForResult(context: Activity, requestCode: Int, params: Params = Params()) {
            context.startActivityForResult(getLaunchIntent(context, params), requestCode)
        }

        private fun getLaunchIntent(context: Context, params: Params): Intent {
            return Intent(context, IapBillingActivity::class.java).apply {
                this.putExtra(PARAMS, params)
                this.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP or Intent.FLAG_ACTIVITY_CLEAR_TOP)
            }
        }
    }


    private var dataItemsList = ArrayList<ProductListingData>()
    private lateinit var iapBillingAdapter: IapBillingAdapter
    private val viewModel: IapBillingViewModel by viewModels()
    private lateinit var purchaseProductBtn: Button
    private lateinit var tvContinueWithAds: TextView
    private lateinit var title: TextView
    private lateinit var subTitle: TextView
    private lateinit var tvPackLabel: TextView
    private lateinit var tvTheme: TextView
    private lateinit var tvNoAds: TextView
    private lateinit var tvTrash: TextView
    private lateinit var tvMusic: TextView
    private lateinit var tvCrop: TextView
    private lateinit var tvFilterDuplicate: TextView
    private lateinit var progressBarCyclic: ProgressBar
    private lateinit var llPacksContainer: LinearLayout
    private lateinit var ivClose: ImageView
    private var productDataList: List<ProductListingData> = emptyList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setFullScreenMode()
        initUi()
        setupDataList()
        setListener()
        showAppSpecificFeature()
    }


    private fun initUi() {
        setContentView(R.layout.activity_iap_billing)
        val recyclerView: RecyclerView = findViewById(R.id.pack_recyclerview)
        purchaseProductBtn = findViewById(R.id.btn_continue)
        tvContinueWithAds = findViewById(R.id.tvContinueWithAds)
        progressBarCyclic = findViewById(R.id.progressBarCyclic)
        ivClose = findViewById(R.id.ivClose)
        iapBillingAdapter = IapBillingAdapter(
            this@IapBillingActivity, dataItemsList, this
        )
        val layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = iapBillingAdapter
        llPacksContainer = findViewById(R.id.llPacksContainer)
        tvTheme = findViewById(R.id.tvTheme)
        tvNoAds = findViewById(R.id.tvNoAds)
        tvTrash = findViewById(R.id.tvTrash)
        tvMusic = findViewById(R.id.tvMusic)
        tvCrop = findViewById(R.id.tvCrop)
        tvFilterDuplicate = findViewById(R.id.tvFilterDuplicate)
        title = findViewById(R.id.title)
        subTitle = findViewById(R.id.subTitle)
        tvPackLabel = findViewById(R.id.tvPackLabel)

        setFont()
    }

    private fun setFont() {
        title.setTextFont(FONT.SEMI_BOLD)
        subTitle.setTextFont(FONT.MEDIUM)
        purchaseProductBtn.setTextFont(FONT.SEMI_BOLD)
        tvContinueWithAds.setTextFont(FONT.MEDIUM)
        tvTheme.setTextFont(FONT.SEMI_BOLD)
        tvNoAds.setTextFont(FONT.SEMI_BOLD)
        tvTrash.setTextFont(FONT.SEMI_BOLD)
        tvMusic.setTextFont(FONT.SEMI_BOLD)
        tvCrop.setTextFont(FONT.SEMI_BOLD)
        tvFilterDuplicate.setTextFont(FONT.SEMI_BOLD)
        tvPackLabel.setTextFont(FONT.SEMI_BOLD)
    }


    private fun setupDataList() {
        viewModel.getInAppPacksFromRc(params.defaultLocalPackJson,false)

        lifecycleScope.launch() {
            withContext(Dispatchers.Main) {
                viewModel.productsForSaleFlows.collect {
                    productDataList = it
                    setAdapter(productDataList)
                    //Get Already owned products
                    viewModel.getPurchasedItemsList()
                }
            }
        }

        lifecycleScope.launch() {
            viewModel.isNewPurchaseAcknowledged.collect {
                if (it) {
                    viewModel.persistRecentlyPurchasedProduct(
                        selectedProduct?.productIdPurchase ?: ""
                    )
                    showPurchaseCompleteDialog()
                }
            }
        }

        lifecycleScope.launch() {
            viewModel.purchasedProductMap.collect { productStatusMap ->
                setAdapter(productDataList, productStatusMap)
            }
        }
    }

    private fun setListener() {
        purchaseProductBtn.setOnClickListener(this)
        tvContinueWithAds.setOnClickListener(this)
        ivClose.setOnClickListener(this)
        togglePurchaseBtn(false)//default
    }

    private fun setAdapter(
        dataList: List<ProductListingData>,
        productStatusMap: Map<String, InAppProductData> = emptyMap()
    ) {

        dataItemsList.clear()
        dataItemsList.addAll(dataList)

        iapBillingAdapter.productStatusMap = productStatusMap
        //  .setProductStatusMap(productStatusMap)
        iapBillingAdapter.notifyDataSetChanged()

        //set First item as selected
        if (dataItemsList.isNotEmpty()) {
            var dataItem = dataItemsList[0]
            dataItem.isSelected = false
            iapBillingAdapter.onClickViewItem(0, dataItem)
        }

        progressBarCyclic.postDelayed(kotlinx.coroutines.Runnable {
            llPacksContainer.visibility = View.VISIBLE
            progressBarCyclic.visibility = View.GONE
        }, 500)
    }

    /**
     * IT is called when item is clicked or Upgrade now btn is clicked
     */
    var selectedProduct: ProductListingData? = null
    private fun onClickBuyProduct(
    ) {
        selectedProduct = iapBillingAdapter.getSelectedProduct()
        selectedProduct?.productDetails?.let {
            viewModel.buy(
                productDetails = it, currentPurchases = null, tag = "", activity = this
            )
        }
    }


    override fun togglePurchaseBtn(buttonStatus: Boolean) {
        if (buttonStatus) {
            purchaseProductBtn.isEnabled = true
            purchaseProductBtn.setOnClickListener(this)
            purchaseProductBtn.setBackgroundResource(R.drawable.shape_gradient_btn_bg_enabled)
        } else {
            purchaseProductBtn.isEnabled = false
            purchaseProductBtn.setBackgroundResource(R.drawable.shape_gradient_btn_bg_disabled)
        }
    }

    private lateinit var purchaseCompleteDialog: IapBillingCompleteDialog
    private fun showPurchaseCompleteDialog() {
        if (!this::purchaseCompleteDialog.isInitialized) {
            purchaseCompleteDialog = IapBillingCompleteDialog(this, ::onSetResult)
        }
        purchaseCompleteDialog.show()
    }

    private fun onSetResult() {
        val intent = Intent()
        setResult(RESULT_OK, intent);
        finish()
    }

    private fun showAppSpecificFeature() {
        var appFeatures: List<FeatureInfo> =
            FeatureInfo.getAppSpecificFeatures(applicationContext.packageName)
        appFeatures.forEach { appFeature ->
            when (appFeature) {
                FeatureInfo.THEME -> {
                    findViewById<LinearLayout>(R.id.llParentFilterDuplicate).show()
                }
                FeatureInfo.NO_ADS -> {
                    findViewById<LinearLayout>(R.id.llParentNoAds).show()
                }
                FeatureInfo.TRASH -> {
                    findViewById<LinearLayout>(R.id.llParentTrash).show()
                }
                FeatureInfo.LYRICS -> {
                    findViewById<LinearLayout>(R.id.llParentTrash).show()
                }
                FeatureInfo.CROP -> {
                    findViewById<LinearLayout>(R.id.llParentCrop).show()
                }
                FeatureInfo.FILTER_DUPLICATE -> {
                    findViewById<LinearLayout>(R.id.llParentFilterDuplicate).show()
                }
                FeatureInfo.THEME -> {
                    findViewById<LinearLayout>(R.id.llParentTheme).show()
                }
                FeatureInfo.UPCOMING -> {
                    findViewById<LinearLayout>(R.id.llParentUpcoming).show()
                }
            }
        }

    }

    override fun onClick(view: View?) {
        when (view?.id) {
            purchaseProductBtn.id -> {
                if (purchaseProductBtn.isEnabled)
                    onClickBuyProduct()
            }
            ivClose.id, tvContinueWithAds.id -> {
                finish()
            }

            findViewById<ImageView>(R.id.llTheme).id -> {
                IapBillingInfoBottomSheet.show(
                    this,
                    R.drawable.ic_theme,
                    resources.getString(R.string.themes_title),
                    resources.getString(R.string.themes_description1),
                    resources.getString(R.string.themes_description2),
                    resources.getString(R.string.themes_description3)
                )
            }
            findViewById<ImageView>(R.id.llNoAds).id -> {
                IapBillingInfoBottomSheet.show(
                    this,
                    R.drawable.ic_no_ads,
                    resources.getString(R.string.ad_free_title),
                    resources.getString(R.string.ad_free_description1),
                    resources.getString(R.string.ad_free_description2),
                    resources.getString(R.string.ad_free_description3)
                )
            }
            findViewById<ImageView>(R.id.llTrash).id -> {
                IapBillingInfoBottomSheet.show(
                    this,
                    R.drawable.ic_trash,
                    resources.getString(R.string.trash_title),
                    resources.getString(R.string.trash_description1),
                    resources.getString(R.string.trash_description2),
                    resources.getString(R.string.trash_description3)
                )
            }
            findViewById<ImageView>(R.id.llLyrics).id -> {
                IapBillingInfoBottomSheet.show(
                    this,
                    R.drawable.ic_music,
                    resources.getString(R.string.lyrics_title),
                    resources.getString(R.string.lyrics_description1),
                    resources.getString(R.string.lyrics_description2),
                    resources.getString(R.string.lyrics_description3)
                )
            }
            findViewById<ImageView>(R.id.llCrop).id -> {
                IapBillingInfoBottomSheet.show(
                    this,
                    R.drawable.ic_crop,
                    resources.getString(R.string.crop_title),
                    resources.getString(R.string.crop_description1),
                    resources.getString(R.string.crop_description2),
                    resources.getString(R.string.crop_description3)
                )
            }
            findViewById<ImageView>(R.id.llFilterDuplicate).id -> {
                IapBillingInfoBottomSheet.show(
                    this,
                    R.drawable.ic_filter_duplicate,
                    resources.getString(R.string.filter_duplicate_title),
                    resources.getString(R.string.filter_duplicate_description1),
                    resources.getString(R.string.filter_duplicate_description2),
                    resources.getString(R.string.filter_duplicate_description3)
                )
            }

            findViewById<ImageView>(R.id.ivUpcoming).id -> {
                IapBillingInfoBottomSheet.show(
                    this,
                    R.drawable.ic_upcoming,
                    resources.getString(R.string.upcoming_feature_title),
                    resources.getString(R.string.upcoming_feature_description),
                    "", ""
                )
            }
        }
    }
}

