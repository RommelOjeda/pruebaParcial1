package com.example.pruebaparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //botonIMC
        btnimc.setOnClickListener{
            val sa: Intent =Intent(this,ventana::class.java)
            startActivity(sa)
        }


    }
}