package com.example.semana_17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class condicionalwhile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_condicionalwhile)

        var x = 0
        while (x < 10) {

            Toast.makeText(this,"$x", Toast.LENGTH_LONG).show()
            x++ // igual a decir x += 1

        }

        val btnregresar2=findViewById<Button>(R.id.btnregresar2)
        btnregresar2.setOnClickListener {
            val principal = Intent(this, MainActivity::class.java)
            startActivity(principal)
            finish()
            }
    }
}