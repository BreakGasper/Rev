package com.breakapp.rev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.HandlerThread
import android.util.Log

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        try {
            supportActionBar!!.hide()
            actionBar!!.hide()
        } catch (e: Exception) {
            Log.d("LOGINACTIVITY ", e.toString())
        }
       

    }


}