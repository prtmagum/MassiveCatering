package com.example.cateringyuk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Pusat_Bantuan_User : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pusat_bantuan_user)
        val btnsimpan: Button = findViewById(R.id.btnsimpan)
        btnsimpan.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnsimpan -> {
                val intent = Intent(this@Pusat_Bantuan_User, Profile_User::class.java)
                startActivity(intent)
            }
        }
    }
}