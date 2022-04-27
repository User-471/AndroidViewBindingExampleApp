package dkworks.viewbindingexample.app

import android.app.Application
import timber.log.Timber

class AndroidViewBindingExampleApp: Application() {

    override fun onCreate() {
        super.onCreate()

        initTimber()
    }

    private fun initTimber() {
        Timber.plant(Timber.DebugTree())
    }
}