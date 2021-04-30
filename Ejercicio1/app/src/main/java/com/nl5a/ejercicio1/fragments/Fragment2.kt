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

class Fragment2 : Fragment() {
    lateinit var v : View
    lateinit var txt2Screen : TextView
    lateinit var btnTo4 : Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        v = inflater.inflate(R.layout.fragment_2, container, false)
        btnTo4 = v.findViewById(R.id.btnTo4)
        return v
    }

    override fun onStart() {
        super.onStart()
        btnTo4.setOnClickListener(){
            val action = Fragment2Directions.actionFragment2ToFragment4()
            v.findNavController().navigate(action)
        }
    }
}