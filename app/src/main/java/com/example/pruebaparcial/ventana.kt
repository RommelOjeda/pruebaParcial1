package com.example.pruebaparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_ventana.*

class ventana : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana)

        //Spinner Genero
        var genero: Spinner? = null
        genero = findViewById(R.id.genero)
        val lista = arrayOf("  Genero", "Macho", "Hembra")
        var adaptador: ArrayAdapter<String> =
            ArrayAdapter(this, android.R.layout.simple_spinner_item, lista)
        genero?.adapter = adaptador

        //Spinner Raza
        var raza: Spinner? = null
        raza = findViewById(R.id.raza)
        val lista1 = arrayOf("  Raza", "Chihuahua", "Boxer", "Pitbull", "Bulldog", "Labrador")
        var adaptador1: ArrayAdapter<String> =
            ArrayAdapter(this, android.R.layout.simple_spinner_item, lista1)
        raza?.adapter = adaptador1

        //Spinner Tipo de Calculo
        var cal: Spinner? = null
        cal = findViewById(R.id.cal)
        val lista2 = arrayOf("  Tipo de Calculo", "Grasa Corporal Macho", "Grasa Corporal Hembra")
        var adaptador2: ArrayAdapter<String> =
            ArrayAdapter(this, android.R.layout.simple_spinner_item, lista2)
        cal?.adapter = adaptador2

        cal?.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val valor = cal
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        calcular.setOnClickListener {
                //recolectar variables del fomrulario
                var nombre: String = nombre.text.toString()
                var pes: String = peso.text.toString()
                var alt: String = altura.text.toString()
                var occi:String = occi.text.toString()
                val tip: String = cal.toString()

                var peso = Integer.parseInt(pes)
                var altura = Integer.parseInt(alt)
                var occ = Integer.parseInt(occi)


                val saltar: Intent = Intent(this, procesar::class.java)
                //Envio de variables
                saltar.putExtra("nombre", nombre)
                saltar.putExtra("peso", peso)
                saltar.putExtra("altura", altura)
                saltar.putExtra("occi", occ)
                saltar.putExtra("tipo", tip)

            startActivity(saltar)

        }
    }
}