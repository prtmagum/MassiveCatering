package com.example.cateringyuk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class verifikasi_email : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verifikasi_email)
        val btnVerif: Button = findViewById(R.id.btnVerif)
        btnVerif.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnVerif -> {
                val intent = Intent(this@verifikasi_email, loginSebagaiUser::class.java)
                startActivity(intent)
            }
        }
    }
}