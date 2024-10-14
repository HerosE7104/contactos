package com.example.contactos

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.base_adapter.*

class contacadapter(private val mContext: Context,private val lista: List<ContactoModel>) : ArrayAdapter<ContactoModel>(mContext,0,lista) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(mContext).inflate(R.layout.base_adapter, parent, false)
        val contacto =lista[position]
        layout.nombre.text = contacto.nombre
        layout.telefono.text = contacto.telefono
        layout.email.text = contacto.email
        layout.imageView.setImageResourse(contacto.imagenid)
        return layout
    }
}