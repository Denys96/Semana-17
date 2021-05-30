package com.example.semana_17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class condicionalFor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_condicional_for)

        val names = listOf("Anne", "Peter", "Jeff")
        for (name in names) {
            Toast.makeText(this, "$name", Toast.LENGTH_LONG).show()

            val texto = findViewById(R.id.txtmensaje) as TextView
            texto.setText(name)
        }

        val btnregresar=findViewById<Button>(R.id.btnregresar)
        btnregresar.setOnClickListener {
            val principal = Intent(this, MainActivity::class.java)
            startActivity(principal)
        }
    }
}


