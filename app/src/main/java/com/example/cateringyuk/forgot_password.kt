package com.example.cateringyuk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class forgot_password : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        val btnKirim: Button = findViewById(R.id.btnKirim)
        btnKirim.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.btnKirim -> {
                val intent = Intent(this@forgot_password, verifikasi_email::class.java)
                startActivity(intent)
            }
    }}
}