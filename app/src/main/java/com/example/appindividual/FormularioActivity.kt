package com.example.appindividual

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FormularioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etCelular = findViewById<EditText>(R.id.etCelular)
        val etCedula = findViewById<EditText>(R.id.etCedula)
        val btnInscribirse = findViewById<Button>(R.id.btnInscribirse)

        btnInscribirse.setOnClickListener {

            val nombre = etNombre.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val celular = etCelular.text.toString().trim()
            val cedula = etCedula.text.toString().trim()

            if (nombre.isEmpty() || email.isEmpty() || celular.isEmpty() || cedula.isEmpty()) {
                Toast.makeText(this, "Por favor complete todos los campos", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, ResumenActivity::class.java)
                intent.putExtra("nombre", nombre)
                intent.putExtra("email", email)
                intent.putExtra("celular", celular)
                intent.putExtra("cedula", cedula)
                startActivity(intent)
            }
        }
    }
}