package com.example.responsi_257

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var editEmail : EditText
    private lateinit var editPassword : EditText
    private lateinit var btnLogin : Button
    private lateinit var tvRegister : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editEmail = findViewById(R.id.edit_email)
        editPassword = findViewById(R.id.edit_password)
        btnLogin = findViewById(R.id.btn_login)
        tvRegister = findViewById(R.id.tv_register)

        btnLogin.setOnClickListener {
            val editEmail = edit_email.text.toString()
            val editPassword = edit_password.text.toString()

            val username = intent.getStringExtra("username")
            val email = intent.getStringArrayExtra("email")
            val password = intent.getStringArrayExtra("password")

            if (editEmail.isEmpty() || editPassword.isEmpty()){
                Toast.makeText(this, "Login Gagal", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if (editEmail!="muldaninormanhalie@gmail.com"){
                Toast.makeText(this, "Email salah", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }else
                if (editPassword!="Muldani77"){
                    Toast.makeText(this, "Password salah", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

            intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("email", email)
            intent.putExtra("password", password)

            intent.putExtra("Email", editEmail)
            intent.putExtra("Password", editPassword)
            startActivity(intent)
        }

        tvRegister.setOnClickListener{
            intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)

        }
    }
}
