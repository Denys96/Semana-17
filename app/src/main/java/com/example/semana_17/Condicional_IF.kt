package com.example.semana_17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Condicional_IF : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_condicional_if)

        val Edad = findViewById<EditText>(R.id.edtEdad)
        var Calcular = findViewById<Button>(R.id.btnCalcular)
        val Texto = findViewById<TextView>(R.id.txtRespuesta) as TextView


        Calcular.setOnClickListener{
            Calcular.text= Edad.text.toString()
            val Year :Int = 0

                if (Year <= 17 ) { true
                    Texto.text = "Es menor de Edad"

                } else if (Year >= 18) { false

                    Texto.text = "Es mayor de Edad"
                }
            return@setOnClickListener
            }

        val btnregresar=findViewById<Button>(R.id.btnregresar3)
        btnregresar.setOnClickListener {
            val principal = Intent(this, MainActivity::class.java)
            startActivity(principal)
        }
    }
    }


