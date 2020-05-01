package com.example.navigatewithgraph

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import android.util.Log
import android.view.View
import android.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.example.navigatewithgraph.databinding.ActivityMainBinding
import com.example.navigatewithgraph.fragment.StepFourFragment
import com.example.navigatewithgraph.fragment.StepThreeFragmentDirections
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class MainActivity : AppCompatActivity() {
// taking extra initialization out
    val applicationScope= CoroutineScope(Dispatchers.Default)
lateinit var drawerLayout: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding= DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
         drawerLayout=binding.drawerLayout
       val toolbar=binding.toolbar

        val navController=this.findNavController(R.id.fragment)

        toolbar.setupWithNavController(navController)

       // NavigationUI.setupActionBarWithNavController(this,navController)
        binding.navView.setupWithNavController(navController)
        binding.bottomNavigationView.setupWithNavController(navController)

        navController.addOnDestinationChangedListener { controller, destination, arguments ->

            if (destination.id==controller.graph.startDestination){
                drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
            }
            else drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)

            bottomNavController(destination, binding, toolbar)

        }
        enableStrictMode()

    }

    private fun enableStrictMode() {
        if (BuildConfig.DEBUG){
            val policy=StrictMode.ThreadPolicy.Builder()
                .detectAll()
                .penaltyLog()
                .build()
            StrictMode.setThreadPolicy(policy)
        }
    }

    private fun bottomNavController(
        destination: NavDestination,
        binding: ActivityMainBinding,
        toolbar: androidx.appcompat.widget.Toolbar
    ) {
        when (destination.label) {
            "StepFour" -> {
                binding.bottomNavigationView.visibility = View.VISIBLE
                toolbar.title = destination.label
            }
            "Score" -> {
                binding.bottomNavigationView.visibility = View.VISIBLE
                toolbar.title = destination.label
            }
            "FeedBack" -> {
                binding.bottomNavigationView.visibility = View.VISIBLE
                toolbar.title = destination.label
            }
            else -> binding.bottomNavigationView.visibility = View.GONE
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController=findNavController(R.id.fragment)
        return navController.navigateUp() ||super.onSupportNavigateUp()
    }

    override fun onResume() {
        super.onResume()

           openDrawer()


    }

 private    fun openDrawer() {
        Thread.sleep(2000)
            drawerLayout.open()


    }
}
