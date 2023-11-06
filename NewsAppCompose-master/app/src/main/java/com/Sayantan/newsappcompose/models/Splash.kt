package com.Sayantan.newsappcompose.models

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.Sayantan.newsappcompose.activities.HomeActivity
import com.Sayantan.newsappcompose.R

class Splash : AppCompatActivity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        handler = Handler()
        handler.postDelayed({


            val intent = Intent( this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        },    4000 )


    }
}