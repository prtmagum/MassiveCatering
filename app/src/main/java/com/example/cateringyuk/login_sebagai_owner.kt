package com.example.cateringyuk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class login_sebagai_owner : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_sebagai_owner)
        val btnMasuk: Button = findViewById(R.id.btnMasuk)
        btnMasuk.setOnClickListener(this)
        val buttonUser: Button = findViewById(R.id.buttonuser)
        buttonUser.setOnClickListener(this)
        val tvForgot: TextView = findViewById(R.id.tvForgot)
        tvForgot.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.btnMasuk -> {
                val intent = Intent(this@login_sebagai_owner, HomePage::class.java)
                startActivity(intent)
            }
            R.id.buttonuser -> {
                val intent = Intent(this@login_sebagai_owner, loginSebagaiUser::class.java)
                startActivity(intent)
            }
            R.id.tvForgot -> {
                val intent = Intent(this@login_sebagai_owner, forgot_password::class.java)
                startActivity(intent)
            }
    }}
}