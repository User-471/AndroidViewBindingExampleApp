package dkworks.viewbindingexample.app.ui.main

import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import dkwokrs.viewbindingexample.app.R
import dkwokrs.viewbindingexample.app.databinding.ActivityMainBinding
import dkworks.viewbindingexample.app.ui.base.BaseActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import timber.log.Timber

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {

    private var navHost: NavHostFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initNavigation()
    }

    private fun initNavigation() {
        navHost = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment

        navHost?.findNavController()?.setGraph(R.navigation.nav_main)
    }
}