package com.example.cateringyuk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class landingpage : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landingpage)

        val tvMasuk: TextView = findViewById(R.id.tvMasuk)
        tvMasuk.setOnClickListener(this)
        val btnMulai: Button = findViewById(R.id.btnMulai)
        btnMulai.setOnClickListener(this)
        val btnRegis: TextView = findViewById(R.id.btnRegis)
        btnRegis.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.tvMasuk -> {
                val intent = Intent(this@landingpage, loginSebagaiUser::class.java)
                startActivity(intent)
            }
            R.id.btnMulai -> {
                val intent = Intent(this@landingpage, loginSebagaiUser::class.java)
                startActivity(intent)
            }
            R.id.btnRegis -> {
                val intent = Intent(this@landingpage, register_user::class.java)
                startActivity(intent)
            }
        }
    }
}