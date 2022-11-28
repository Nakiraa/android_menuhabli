package com.hb.menuhabli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

val riwayat : MutableList<String> = mutableListOf<String>()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hasil : Button = findViewById(R.id.hasil)
        hasil.setOnClickListener {hasilsegitiga()}

//        val reset : Button = findViewById(R.id.reset)
//        hasil.setOnClickListener {reset1()}

    }

    private fun hasilsegitiga(){
        val alas : EditText = findViewById(R.id.alas)
        val tinggi : EditText = findViewById(R.id.tinggi)
        val segitiga : TextView = findViewById(R.id.rumusluas)

        val alas1 = alas.text.toString().toInt()
        val tinggi1 = tinggi.text.toString().toInt()

        val hasil = 0.5 * alas1 * tinggi1

        segitiga.text = hasil.toInt().toString()
        val hasil1 = hasil.toInt().toString()

        riwayat.add("0.5 X $alas1 X $tinggi1 = $hasil1 ")

    }

//    private fun reset1(){
//        val alas : EditText = findViewById(R.id.alas)
//        val tinggi : EditText = findViewById(R.id.tinggi)
//        val segitiga : TextView = findViewById(R.id.rumusluas)
//
//        val alas1 = alas.text.toString().toInt()
//        val tinggi1 = tinggi.text.toString().toInt()
//        val segitiga1 = segitiga.text.toString().toInt()
//
//        val hasil = 0.5 * alas1 * tinggi1
//
//        segitiga.text = hasil.toInt().toString()
//
//        alas.setText("")
//        tinggi.setText("")
//    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.new_game -> {
                val bantuan = Intent(this@MainActivity,help::class.java)
                startActivity(bantuan)
                Toast.makeText(this, "help", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.help -> {
                val bantuan = Intent(this@MainActivity,about::class.java)
                startActivity(bantuan)
                Toast.makeText(this, "about", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.histori -> {
                val bantuan = Intent(this@MainActivity,histori::class.java)
                startActivity(bantuan)
                Toast.makeText(this, "riwayat", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}