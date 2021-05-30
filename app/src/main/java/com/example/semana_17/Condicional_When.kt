package com.example.semana_17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class Condicional_When : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_condicional_when)

        val vehiculo = "Carro"
        var message = when (vehiculo) {
            "Carro" -> {
                "cuatro ruedas"
            }
            "Bicicleta" -> {
                "dos ruedas"
            }
            else -> {
                "Numero desconocido de ruedas"
            }
        }
        Toast.makeText(this,"$message", Toast.LENGTH_LONG).show()

        val texto = findViewById(R.id.txtResultado) as TextView
        texto.setText(message)

        val btnregresar1=findViewById<Button>(R.id.btnregresar1)
        btnregresar1.setOnClickListener {
            val principal = Intent(this, MainActivity::class.java)
            startActivity(principal)
        }
        }

    }
