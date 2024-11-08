package com.example.lab10

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.lab10.ui.theme.Lab10Theme
import com.example.lab10.view.SeriesApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Habilita diseño de borde a borde (opcional)
        enableEdgeToEdge()

        // Aquí establecemos el contenido principal de la aplicación
        setContent {
            Lab10Theme {
                // Llamamos a la función principal de la aplicación, que es SeriesApp
                SeriesApp()
            }
        }
    }
}
