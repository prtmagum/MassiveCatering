package com.example.cateringyuk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class DetailCatering : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_catering)
        val bottom_navigation: BottomNavigationView = findViewById(R.id.bottom_navigation)
        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bottom_home -> {
                    // Handle home navigation
                    val homeIntent = Intent(this@DetailCatering, HomePage::class.java)
                    startActivity(homeIntent)
                    true
                }

                R.id.bottom_menu -> {
                    // Handle dashboard navigation
                    val menuIntent = Intent(this@DetailCatering, User_Catering::class.java)
                    startActivity(menuIntent)
                    true
                }

                R.id.bottom_profile -> {
                    // Handle notifications navigation
                    val profileIntent = Intent(this@DetailCatering, Profile_User::class.java)
                    startActivity(profileIntent)
                    true
                }

                else -> false
            }
        }
    }
}