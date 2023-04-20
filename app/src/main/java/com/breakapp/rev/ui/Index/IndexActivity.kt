package com.breakapp.rev.ui.Index

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.breakapp.rev.R
import com.breakapp.rev.databinding.ActivityIndexBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class IndexActivity : AppCompatActivity() {
    private lateinit var b: ActivityIndexBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityIndexBinding.inflate(layoutInflater)
        setContentView(b.root)

        try {
            supportActionBar!!.hide()
            actionBar!!.hide()
        } catch (e: Exception) {
            Log.d("IndexActivity ", e.toString())
        }
        val navController = this.findNavController(R.id.nav_host_fragment)
        // Find reference to bottom navigation view
//        val navView: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        // Hook your navigation controller to bottom navigation view
        b.bottomNavigationView.setupWithNavController(navController)
    }


}