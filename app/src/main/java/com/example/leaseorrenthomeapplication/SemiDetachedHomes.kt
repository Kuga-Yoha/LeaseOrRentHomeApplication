package com.example.leaseorrenthomeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class SemiDetachedHomes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_semi_detached_homes)

        val checkoutButton = findViewById<Button>(R.id.semi_detached_house_checkout_button)
        val checkBox1 = findViewById<CheckBox>(R.id.checkbox_semi_detached_home_one)
        val checkBox2 = findViewById<CheckBox>(R.id.checkbox_semi_detached_home_two)
        val checkBox3 = findViewById<CheckBox>(R.id.checkbox_semi_detached_home_three)


        checkoutButton.setOnClickListener {
            if (checkBox1.isChecked || checkBox2.isChecked || checkBox3.isChecked) {
                // At least one CheckBox is checked, proceed to the payment page
                val intent = Intent(this, Payment::class.java)
                startActivity(intent)
            } else {
                // None of the CheckBoxes is checked, show a Toast message
                Toast.makeText(this, "Please choose at least one option", Toast.LENGTH_SHORT).show()
            }
        }
    }
}