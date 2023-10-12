package com.example.leaseorrenthomeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class HomeTypes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_types)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.home_types, menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

//        var menuOption = item.itemId
//        Toast.makeText(this, "You Selected Apartments", Toast.LENGTH_LONG)
        when(item.itemId){
            R.id.menu_apartment -> startActivity(Intent(applicationContext, Apartments::class.java))
            R.id.menu_detached_home -> startActivity(Intent(applicationContext, DetachedHomes::class.java))
            R.id.menu_semi_detached_home -> startActivity(Intent(applicationContext, SemiDetachedHomes::class.java))
            R.id.menu_condo_apartment -> startActivity(Intent(applicationContext, CondominiumApartments::class.java))
            R.id.menu_townhouse -> startActivity(Intent(applicationContext, TownHouses::class.java))
        }
        return super.onOptionsItemSelected(item)

    }
}