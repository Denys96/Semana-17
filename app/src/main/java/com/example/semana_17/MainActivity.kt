package com.example.semana_17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val primera = findViewById<Button>(R.id.btncondiciionalif)
        val segunda = findViewById<Button>(R.id.btncondicionalwhen)
        val tercera = findViewById<Button>(R.id.btncondicionalfor)
        val cuarta = findViewById<Button>(R.id.btncondicionalwhile)
        val quinta = findViewById<Button>(R.id.btncondicionales)

        primera.setOnClickListener{
            val condicional: Intent= Intent(applicationContext, Condicional_IF::class.java)
            startActivity(condicional)
        }

        segunda.setOnClickListener{
            val condicionwhen: Intent= Intent(applicationContext, Condicional_When::class.java)
            startActivity(condicionwhen)
        }

        tercera.setOnClickListener{
            val condicionfor: Intent= Intent(applicationContext, condicionalFor::class.java)
            startActivity(condicionfor)
        }
        cuarta.setOnClickListener{
            val condicionwhile: Intent= Intent(applicationContext, condicionalwhile::class.java)
            startActivity(condicionwhile)
        }
        quinta.setOnClickListener{
            val condiciondropwhile: Intent= Intent(applicationContext, condicionales::class.java)
            startActivity(condiciondropwhile)
        }
    }

}