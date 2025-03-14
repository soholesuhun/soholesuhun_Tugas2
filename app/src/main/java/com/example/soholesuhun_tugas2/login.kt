package com.example.soholesuhun_tugas2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val forgot = findViewById<TextView>(R.id.text_Forgot)

        val btnLogin= findViewById<Button>(R.id.btnLogin)

        val btnRegister= findViewById<TextView>(R.id.text_signUP)

        // Ketika tombol diklik, pindah ke LoginActivity

        btnLogin.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }

        forgot.setOnClickListener {
            val intent = Intent(this, resetPassword::class.java)
            startActivity(intent)
        }

        // Ketika tombol diklik, pindah ke LoginActivity
        btnRegister.setOnClickListener {
            val intent = Intent(this, register::class.java)
            startActivity(intent)
        }

    }
}