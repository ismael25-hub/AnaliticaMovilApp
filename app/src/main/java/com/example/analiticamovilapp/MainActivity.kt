package com.example.analiticamovilapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Referenciar los elementos del XML
        val tvEstadoModelo = findViewById<TextView>(R.id.tvEstadoModelo)
        val btnSincronizar = findViewById<Button>(R.id.btnSincronizar)

        // 2. Programar el evento clic del botón
        btnSincronizar.setOnClickListener {
            // Mostrar Toast
            Toast.makeText(this, "Preparando entorno para consumir API...", Toast.LENGTH_SHORT).show()
            // Cambiar el texto
            tvEstadoModelo.text = "Estado del Modelo: Listo para conectar"
        }
    }

    // 3. Sobrescribir métodos del ciclo de vida
    override fun onStart() {
        super.onStart()
        Log.d("CICLO_VIDA", "La aplicación entró en primer plano (onStart)")
    }

    override fun onPause() {
        super.onPause()
        Log.d("CICLO_VIDA", "La aplicación pasó a segundo plano (onPause)")
    }
}