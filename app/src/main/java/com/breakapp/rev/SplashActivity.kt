package com.breakapp.rev

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.breakapp.rev.databinding.ActivitySplashBinding
import com.breakapp.rev.ui.login.LoginActivity

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        try {
            supportActionBar!!.hide()
            actionBar!!.hide()
        } catch (e: Exception) {
            Log.d("SplashActivity", e.toString())
        }

        //Este handler será ejecutado 5 segundos después.
        Handler().postDelayed({ //***Aquí agregamos el proceso a ejecutar.
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)


    }



}