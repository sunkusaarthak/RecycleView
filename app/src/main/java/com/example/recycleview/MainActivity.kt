package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.adapter.ItemAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recycler = findViewById<RecyclerView>(R.id.recycler_view_items)
        recycler.layoutManager = LinearLayoutManager(this)
        val itemAdapter = ItemAdapter(this, createList())
        recycler.adapter = itemAdapter

    }
    private fun createList() : ArrayList<String> {
        val l = ArrayList<String>()
        for(i in 1 .. 15) {
            l.add("List $i")
        }
        return l;
    }
}