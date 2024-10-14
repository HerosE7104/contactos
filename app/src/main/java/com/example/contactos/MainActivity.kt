package com.example.contactos

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val contacto = ContactoModel("Lennin","555555555","mmmmmmmm@gmail.com",R.drawable.hombre)
        val contacto2 = ContactoModel("Vladimir","777777777","ffffffffff@gmail.com",R.drawable.hombre2)
        val contacto3 = ContactoModel("Surdo","777777777","yyyyyyyyy@gmail.com",R.drawable.hombre3)
        val contacto4 = ContactoModel("Legnaci","57777777777","xxxxxxxxxx@gmail.com",R.drawable.hombre4)
        val listaContactoModel = listOf(contacto,contacto2,contacto3)
        val adapter = contacadapter(this,listaContactoModel)
        adapter.also { lista.adapter = it }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
    }
}