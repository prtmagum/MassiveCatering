package com.example.cateringyuk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class register_user : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_user)
        val buttonowner: Button = findViewById(R.id.buttonowner)
        buttonowner.setOnClickListener(this)
        val buttonBuat: Button = findViewById(R.id.buttonBuat)
        buttonBuat.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.buttonowner -> {
                val intent = Intent(this@register_user, register_owner::class.java)
                startActivity(intent)
            }
            R.id.buttonBuat -> {
                val intent = Intent(this@register_user, loginSebagaiUser::class.java)
                startActivity(intent)
            }
        }
    }
}