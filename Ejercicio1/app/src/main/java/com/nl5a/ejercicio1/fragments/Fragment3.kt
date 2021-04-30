package com.nl5a.ejercicio1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import com.nl5a.ejercicio1.R

class Fragment3 : Fragment() {
    lateinit var v : View
    lateinit var btnTo1 : Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        v = inflater.inflate(R.layout.fragment_3, container, false)
        btnTo1 = v.findViewById(R.id.btn3To1)
        return v
    }

    override fun onStart() {
        super.onStart()
        btnTo1.setOnClickListener() {
            val action = Fragment3Directions.actionFragment3ToFragment1()
            v.findNavController().navigate(action)
        }
    }
}