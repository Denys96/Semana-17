package com.example.semana_17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

data class Curso(val nombre: String, val url:String)

class condicionales : AppCompatActivity() {

    val react= Curso ("React","react")
    val kot =Curso ("Kotlin", "kotlin")
    var cursoactual= react.copy()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_condicionales)

        val btnregresar4=findViewById<Button>(R.id.btnRegresar4)
        btnregresar4.setOnClickListener {
            val principal = Intent(this, MainActivity::class.java)
            startActivity(principal)
        }
        val boton = findViewById(R.id.botoncito) as Button
        boton.setOnClickListener{
            view -> swichtcurso(cursoactual)
        }
    }
        fun swichtcurso(curso:Curso){
            cursoactual = curso.copy()
            when(curso.url){
                "react" -> cursoactual= kot.copy()
                "kotlin" -> cursoactual= react.copy()
                else -> print("Esto nunca va a pasar")
            }
            verenpantalla("curso de ${cursoactual.nombre} en plazi.com/ ${cursoactual.url}")
        }
    fun verenpantalla (s: String){
        val txt = findViewById(R.id.mensaje) as TextView
        txt.setText(s)

    }


}
