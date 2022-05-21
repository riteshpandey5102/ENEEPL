package com.example.eneepl

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import androidx.databinding.DataBindingUtil
import com.example.eneepl.databinding.ActivityHomeactivityBinding
import com.example.eneepl.model.userinfo

class homeactivity : AppCompatActivity() {

    private lateinit var binding : ActivityHomeactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this ,R.layout.activity_homeactivity)
        fullscreen()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(binding.container.id, home_activity_frag())
        transaction.commit()
    }

    private fun fullscreen(){
        @Suppress("DEPRECATION")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }
        supportActionBar!!.hide()
    }



}