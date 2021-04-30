package com.nl5a.ejercicio2.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.nl5a.ejercicio2.R

class Fragment2 : Fragment() {
    lateinit var v : View
    lateinit var txtNom : TextView
    lateinit var txtPrecio : TextView
    lateinit var txtDesc : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_2, container, false)
        txtNom = v.findViewById(R.id.txtName)
        txtPrecio = v.findViewById(R.id.txtPrice)
        txtDesc = v.findViewById(R.id.txtDesc)
        return v
    }

    override fun onStart() {
        super.onStart()

        var nombre = Fragment2Args.fromBundle(requireArguments()).nameProd
        var precio = Fragment2Args.fromBundle(requireArguments()).priceProd
        var desc = Fragment2Args.fromBundle(requireArguments()).descProd

        txtNom.text = "Producto: " + nombre
        txtPrecio.text = "Precio: $" + precio.toString()
        txtDesc.text = "Descripción: " + desc


    }

}