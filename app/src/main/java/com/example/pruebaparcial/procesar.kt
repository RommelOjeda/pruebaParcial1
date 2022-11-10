package com.example.pruebaparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_procesar.*

class procesar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_procesar)

        val extras=intent.extras
        val nombre=extras?.getString("nombre")?:"sin nombre"
        val peso=extras?.getInt("peso")?:-1
        val altura=extras?.getInt("altura")?:-1
        val occ=extras?.getInt("occ")?:-1
        val tipo=extras?.getString("tipo")?:"sin tipo"

        tv_imc.setText("El IMC de "+nombre+" es:")

        //var valor = (peso/altura * occ)

        if(tipo == "Grasa Corporal Macho"){
            val valor = (peso/altura * occ)
            calculototal.setText(""+valor)
        }else{
            val valor = (peso/altura * occ)
            calculototal.setText(""+valor)
        }

        btn3.setOnClickListener {
            val saltar: Intent = Intent(this, MainActivity::class.java)
            startActivity(saltar)
        }
    }
}