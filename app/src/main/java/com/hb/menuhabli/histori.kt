package com.hb.menuhabli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class histori : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_histori)

        val listView = findViewById<ListView>(R.id.listdata)
        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, riwayat)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.new_game -> {
                val bantuan = Intent(this@histori,help::class.java)
                startActivity(bantuan)
                Toast.makeText(this, "help", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.help -> {
                val bantuan = Intent(this@histori,about::class.java)
                startActivity(bantuan)
                Toast.makeText(this, "about", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}