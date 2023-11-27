package com.example.cateringyuk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class register_owner : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_owner)
        val buttonuser: Button = findViewById(R.id.buttonuser)
        buttonuser.setOnClickListener(this)
        val buttonBuatU: Button = findViewById(R.id.buttonBuatU)
        buttonBuatU.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.buttonuser -> {
                val intent = Intent(this@register_owner, register_user::class.java)
                startActivity(intent)
            }
            R.id.buttonBuat -> {
                val intent = Intent(this@register_owner, login_sebagai_owner::class.java)
                startActivity(intent)
            }
        }
    }
}