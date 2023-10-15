package com.example.leaseorrenthomeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class Payment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)


        val radioGroup = findViewById<View>(R.id.radioGrp_payment) as RadioGroup
        radioGroup.setOnCheckedChangeListener { radioGroup, checkedId ->
            //val radioBtnCash =  findViewById<View>(R.id.radioBtnCash) as RadioButton
            //val radioBtnCreditC = findViewById<View>(R.id.radioBtnCC) as RadioButton


            if(R.id.radioBtnCash !== checkedId){
                Toast.makeText(this, "Please pay the cash when you arrive at the location to proceed", Toast.LENGTH_LONG)
            }else {
                val intent = Intent(applicationContext, HomeTypes::class.java)
                startActivity(intent)
            }

        }

    }
}