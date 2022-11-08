package com.example.phones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val email: String = "User@gmail.com"
        val Pass: String = "12345"

        //Inisiasi atribut pada tampilan login
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPass = findViewById<EditText>(R.id.etPass)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        //Menambahkan action button pada form login
        btnLogin.setOnClickListener(View.OnClickListener {
            if (etEmail.text.isEmpty() || etPass.text.isEmpty()) {
                Toast.makeText(this, "Isi data pengguna dengan benar", Toast.LENGTH_SHORT).show()
            } else if (etEmail.text.toString().equals(email) && etPass.text.toString()
                    .equals(Pass)
            ) {
                Toast.makeText(this, "Login Berhasil", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login gagal", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
//Line 25 adalah aksi jika email atau password kosong
//Line 27 adalah aksi jika email atau password sesuai
//Line 32 adalah aksi jika email atau password tidak sesuai
//Disini saya menggunakan operator if else