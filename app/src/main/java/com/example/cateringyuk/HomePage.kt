package com.example.cateringyuk

import android.content.ClipData.Item
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomePage : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val dfiola: ImageView = findViewById(R.id.dfiola)
        dfiola.setOnClickListener(this)
        val btn_profile: ImageView = findViewById(R.id.btn_profile)
        btn_profile.setOnClickListener(this)
        val bottom_navigation: BottomNavigationView = findViewById(R.id.bottom_navigation)
        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bottom_home -> {
                    // Handle home navigation
                    val homeIntent = Intent(this@HomePage, HomePage::class.java)
                    startActivity(homeIntent)
                    true
                }

                R.id.bottom_menu -> {
                    // Handle dashboard navigation
                    val menuIntent = Intent(this@HomePage, User_Catering::class.java)
                    startActivity(menuIntent)
                    true
                }

                R.id.bottom_profile -> {
                    // Handle notifications navigation
                    val profileIntent = Intent(this@HomePage, Profile_User::class.java)
                    startActivity(profileIntent)
                    true
                }

                else -> false
            }
        }
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.bottom_navigation -> {
                val intent = Intent(this@HomePage, Profile_User::class.java)
                startActivity(intent)
            }
            R.id.bottom_profile -> {
                val intent = Intent(this@HomePage, Profile_User::class.java)
                startActivity(intent)
            }
                R.id.dfiola -> {
                    val intent = Intent(this@HomePage, DetailCatering::class.java)
                    startActivity(intent)
                }
        }
    }
}