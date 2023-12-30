 package com.example.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

 class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    lateinit var spinner : Spinner
    lateinit var textView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spinner = findViewById(R.id.spinnerco)
        textView = findViewById(R.id.textView)
        spinner.onItemSelectedListener = this
        var arrayAdapter = ArrayAdapter.createFromResource(
            this,
            R.array.co,
            android.R.layout.simple_spinner_item
        )
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = arrayAdapter
    }

     override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
       if(parent != null)
       {
           textView.text = parent.getItemAtPosition(position).toString()
       }
     }

     override fun onNothingSelected(p0: AdapterView<*>?) {

     }
 }