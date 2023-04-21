

 1. Start payment flow in following way:

       /**
             *  Fetch local json in case Network is not available
             *   OR RC does not return data
             */
            var defaultLocalPackJson = CoreUtils.loadJSONFromAsset(this, "DefaultPackJsonData")
            Log.d("defaultLocalPackJson", " 1mm " + defaultLocalPackJson)
            IapBillingActivity.launchForResult(
                FileManagerMainActivity@this,
                IapBillingActivity.RequestCode,
                IapBillingActivity.Params(defaultLocalPackJson)
            )
        }

2.  In Resulting activity. Open Dash board Activity
var intent = Intent(this, FileManagerMainActivity::class.java)
        startActivity(intent)