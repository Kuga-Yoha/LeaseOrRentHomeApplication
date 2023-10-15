package com.example.leaseorrenthomeapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Checkout : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)

        val paymentNumber = findViewById<EditText>(R.id.paymentNumber)
        val expiry = findViewById<EditText>(R.id.expiry)
        val security = findViewById<EditText>(R.id.security)
        val firstname = findViewById<EditText>(R.id.firstname)
        val lastname = findViewById<EditText>(R.id.lastname)
        val paymentAddress = findViewById<EditText>(R.id.paymentAddress)
        val city = findViewById<EditText>(R.id.city)
        val province = findViewById<EditText>(R.id.province)
        val postal = findViewById<EditText>(R.id.postal)
        val contact = findViewById<EditText>(R.id.contact)
        val submitButton = findViewById<Button>(R.id.submitButton)

        submitButton.setOnClickListener {
            // Validation
            if (!isInputValid(paymentNumber, "Credit Card Number") ||
                !isInputValid(expiry, "Expiry Date") ||
                !isInputValid(security, "CVV") ||
                !isInputValid(firstname, "First Name") ||
                !isInputValid(lastname, "Last Name") ||
                !isInputValid(paymentAddress, "Address") ||
                !isInputValid(city, "City") ||
                !isInputValid(province, "Province") ||
                !isInputValid(postal, "Postal Code") ||
                !isInputValid(contact, "Contact No.")
            ) {
                // Display an error message to the user or take appropriate action
                return@setOnClickListener
            }

            // If all inputs are valid, proceed with the submission
            // Implement your submission logic here
            //commit
        }
    }

    private fun isInputValid(editText: EditText, fieldName: String): Boolean {
        val input = editText.text.toString().trim()
        if (input.isEmpty()) {
            editText.error = "$fieldName is required"
            return false
        }
        return true
    }
}
