package com.example.appindividual

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResumenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_resumen)
        
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val tvNombre = findViewById<TextView>(R.id.tvResumenNombre)
        val tvEmail = findViewById<TextView>(R.id.tvResumenEmail)
        val tvCelular = findViewById<TextView>(R.id.tvResumenCelular)
        val tvCedula = findViewById<TextView>(R.id.tvResumenCedula)

        val nombre = intent.getStringExtra("nombre")
        val email = intent.getStringExtra("email")
        val celular = intent.getStringExtra("celular")
        val cedula = intent.getStringExtra("cedula")

        tvNombre.text = "Nombre: $nombre"
        tvEmail.text = "Email: $email"
        tvCelular.text = "Celular: $celular"
        tvCedula.text = "Cédula: $cedula"
    }
}