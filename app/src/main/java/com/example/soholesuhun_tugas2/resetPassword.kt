package com.example.soholesuhun_tugas2

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class resetPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_reset_password)


        val reset = findViewById<TextView>(R.id.forgottt)

        // Ketika tombol diklik, pindah ke LoginActivity

        reset.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)

        }
    }}