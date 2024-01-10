package com.roderiklight.act1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

private var selectedOption: Int = 0

class ModuleFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_module, container, false)

        val option = view.findViewById<Spinner>(R.id.spinner)

        if(option != null) {
            val adapter = context?.let { context ->
                ArrayAdapter(
                    context,
                    android.R.layout.simple_spinner_item,
                    resources.getStringArray(R.array.spinner_options)
                )
            }
            option.adapter = adapter

            option.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener{
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                    selectedOption = position
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }

            }
        }

        return view



    }

}