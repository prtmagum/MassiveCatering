package com.example.cateringyuk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.google.android.material.bottomnavigation.BottomNavigationView

class Profile_User : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_user)
        val btnprofil: ImageView = findViewById(R.id.btnprofil)
        btnprofil.setOnClickListener(this)
        val btnpbantuan: ImageView = findViewById(R.id.btnpbantuan)
        btnpbantuan.setOnClickListener(this)
        val btnquit: ImageView = findViewById(R.id.btnquit)
        btnquit.setOnClickListener(this)

        val bottom_navigation: BottomNavigationView = findViewById(R.id.bottom_navigation)
        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bottom_home -> {
                    // Handle home navigation
                    val homeIntent = Intent(this@Profile_User, HomePage::class.java)
                    startActivity(homeIntent)
                    true
                }

                R.id.bottom_menu -> {
                    // Handle dashboard navigation
                    val menuIntent = Intent(this@Profile_User, User_Catering::class.java)
                    startActivity(menuIntent)
                    true
                }

                R.id.bottom_profile -> {
                    // Handle notifications navigation
                    val profileIntent = Intent(this@Profile_User, Profile_User::class.java)
                    startActivity(profileIntent)
                    true
                }

                else -> false
            }
        }
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnprofil -> {
                val intent = Intent(this@Profile_User, Profile_User_Edit::class.java)
                startActivity(intent)
            }

            R.id.btnpbantuan -> {
                val intent = Intent(this@Profile_User, Pusat_Bantuan_User::class.java)
                startActivity(intent)
            }
            R.id.btnquit -> {
                val intent = Intent(this@Profile_User, loginSebagaiUser::class.java)
                startActivity(intent)
            }
        }
    }
}
