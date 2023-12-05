package com.example.cateringyuk

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.google.android.material.bottomnavigation.BottomNavigationView

class User_Catering : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_catering)
        val dfiola: ImageView = findViewById(R.id.dfiola)
        dfiola.setOnClickListener(this)
        val bottom_navigation: BottomNavigationView = findViewById(R.id.bottom_navigation)
        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bottom_home -> {
                    // Handle home navigation
                    val homeIntent = Intent(this@User_Catering, HomePage::class.java)
                    startActivity(homeIntent)
                    true
                }

                R.id.bottom_menu -> {
                    // Handle dashboard navigation
                    val menuIntent = Intent(this@User_Catering, User_Catering::class.java)
                    startActivity(menuIntent)
                    true
                }

                R.id.bottom_profile -> {
                    // Handle notifications navigation
                    val profileIntent = Intent(this@User_Catering, Profile_User::class.java)
                    startActivity(profileIntent)
                    true
                }

                else -> false
            }
        }
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.dfiola -> {
                val intent = Intent(this@User_Catering, DetailCatering::class.java)
                startActivity(intent)
            }
        }
    }
}