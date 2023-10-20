package com.example.leaseorrenthomeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class Detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)


        val result:String = intent.getStringExtra("selected").toString()
        val title:String = intent.getStringExtra("title").toString()

        findViewById<TextView>(R.id.list).text = "$title:\n$result"
    }

    fun paymentOption(view: View){
        intent = Intent(this, Payment::class.java)
        startActivity(intent)
    }
}