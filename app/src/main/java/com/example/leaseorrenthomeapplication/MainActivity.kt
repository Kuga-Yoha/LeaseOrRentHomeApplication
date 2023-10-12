package com.example.leaseorrenthomeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    Redirect to HomeTypes Activity
    fun showPropertyTypes(view: View){
        val intent = Intent(applicationContext, HomeTypes::class.java)
        startActivity(intent)
    }
}