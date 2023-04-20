package com.breakapp.rev.ui.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.appcompat.app.AppCompatActivity
import com.breakapp.rev.R
import com.breakapp.rev.databinding.ActivityLoginBinding
import com.breakapp.rev.ui.Index.IndexActivity

class LoginActivity : AppCompatActivity() {
    private lateinit var b: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        b = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(b.root)

        try {
            supportActionBar!!.hide()
            actionBar!!.hide()
        } catch (e: Exception) {
            Log.d("LOGINACTIVITY ", e.toString())
        }


        b.btnLogin.setOnClickListener {
            val intent = Intent(this, IndexActivity::class.java)
            startActivity(intent)
        }

    }

    fun MenuRadio(view: View) {
        if (b.rbLogin.isChecked) {
            b.lLSingUp.visibility = GONE
            b.lLLogin.visibility = VISIBLE
        }
        if (b.rbSingup.isChecked) {
            b.lLLogin.visibility = GONE
            b.lLSingUp.visibility = VISIBLE
        }


    }


}