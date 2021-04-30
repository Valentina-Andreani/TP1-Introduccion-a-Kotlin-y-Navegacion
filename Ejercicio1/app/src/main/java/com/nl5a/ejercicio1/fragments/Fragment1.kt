package com.nl5a.ejercicio1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.nl5a.ejercicio1.R


class Fragment1 : Fragment() {
    lateinit var v : View
    lateinit var btnSc2 : Button
    lateinit var btnSc3 : Button
    lateinit var btnSc4 : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

            v = inflater.inflate(R.layout.fragment_1, container, false)
            btnSc2 = v.findViewById(R.id.btnTo2)
            btnSc3 = v.findViewById (R.id.btnTo3)
            btnSc4 = v.findViewById(R.id.btnTo4)
            return v

    }

    override fun onStart() {
        super.onStart()

        btnSc2.setOnClickListener{
            val action = Fragment1Directions.actionFragment1ToFragment2()
            v.findNavController().navigate(action)
        }
        btnSc3.setOnClickListener{
            val action2 = Fragment1Directions.actionFragment1ToFragment3()
            v.findNavController().navigate(action2)
        }
        btnSc4.setOnClickListener{
            val action3 = Fragment1Directions.actionFragment1ToFragment4()
            v.findNavController().navigate(action3)
        }
    }
}