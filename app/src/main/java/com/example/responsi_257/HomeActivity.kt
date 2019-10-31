package com.example.responsi_257

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.responsi_257.adapter.ListPresidenAdapter
import com.example.responsi_257.model.DataPresiden
import com.example.responsi_257.model.Presiden

class HomeActivity : AppCompatActivity() {
    private lateinit var rv_presiden: RecyclerView
    private var list: ArrayList<Presiden> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        rv_presiden = findViewById(R.id.rv_presiden)
        rv_presiden.setHasFixedSize(true)
        list.addAll(DataPresiden.listPresiden)
        showMakananList()
    }

    private fun showMakananList() {
        rv_presiden.layoutManager = LinearLayoutManager(this)
        val listMakananAdapter = ListPresidenAdapter(list)
        rv_presiden.adapter = listMakananAdapter
    }
}
