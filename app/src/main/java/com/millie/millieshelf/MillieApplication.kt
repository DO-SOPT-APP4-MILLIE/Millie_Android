package com.millie.millieshelf

import android.app.Application
import com.millie.millieshelf.data.api.ApiFactory

class MillieApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        ApiFactory.retrofit = ApiFactory.getRetrofit(BuildConfig.MILLIE_BASE_URL)

    }
}
