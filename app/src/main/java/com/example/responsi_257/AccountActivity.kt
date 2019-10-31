package com.example.responsi_257

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AccountActivity : AppCompatActivity() {
    private lateinit var textProses: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        textProses = findViewById(R.id.text_proses)

        val bundle: Bundle? = intent.extras
        var username = bundle?.get("Username").toString()
        var email = bundle?.get("E-mail").toString()
        var password = bundle?.get("Password").toString()

        textProses.text = """
            Username : ${username}
            E-Mail : ${email}
            Password : ${password}
        """.trimIndent()
    }
}