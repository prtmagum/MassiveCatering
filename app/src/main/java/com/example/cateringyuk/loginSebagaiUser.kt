package com.example.cateringyuk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class loginSebagaiUser : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_sebagai_user)
        val btnMasuk: Button = findViewById(R.id.btnMasuk)
        btnMasuk.setOnClickListener(this)
        val buttonUser: Button = findViewById(R.id.buttonuser)
        buttonUser.setOnClickListener(this)
        val buttonowner: Button = findViewById(R.id.buttonowner)
        buttonowner.setOnClickListener(this)
        val tvForgot: TextView = findViewById(R.id.tvForgot)
        tvForgot.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id){
        R.id.btnMasuk -> {
            val intent = Intent(this@loginSebagaiUser, HomePage::class.java)
            startActivity(intent)
        }
            R.id.buttonowner -> {
                val intent = Intent(this@loginSebagaiUser, login_sebagai_owner::class.java)
                startActivity(intent)
            }
            R.id.tvForgot -> {
                val intent = Intent(this@loginSebagaiUser, forgot_password::class.java)
                startActivity(intent)
            }
    }
    }
}