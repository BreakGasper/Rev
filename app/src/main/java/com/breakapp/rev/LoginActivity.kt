package com.breakapp.rev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        try {
            supportActionBar!!.hide()
            actionBar!!.hide()
        } catch (e: Exception) {
            Log.d("CONFIGACTIVITY ", e.toString())
        }
    }
}