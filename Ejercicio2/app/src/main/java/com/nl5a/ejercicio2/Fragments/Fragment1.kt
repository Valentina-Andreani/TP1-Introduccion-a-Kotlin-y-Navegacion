package com.nl5a.ejercicio2.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.nl5a.ejercicio2.Fragments.Entities.Product
import com.nl5a.ejercicio2.R

class Fragment1 : Fragment() {
    lateinit var v : View
    lateinit var btnFrag2 : Button
    lateinit var product : Product

  override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       v = inflater.inflate(R.layout.fragment_1,container,false)
      btnFrag2 = v.findViewById(R.id.btnToFrag2)
      return v

    }

    override fun onStart() {
        super.onStart()

        product = Product("Cupid Chain", 950.0, "Material: Cadena y dije en acero quirúrgico. Largo: 40cm.")

        btnFrag2.setOnClickListener(){
        val action = Fragment1Directions.actionFragment1ToFragment2(product.nombre, product.precio.toFloat(), product.desc)
        v.findNavController().navigate(action)
        }

    }

}