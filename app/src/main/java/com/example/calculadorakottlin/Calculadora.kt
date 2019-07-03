package com.example.calculadorakottlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.calculadora.*

class Calculadora : AppCompatActivity() {

    val TAG ="hello"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculadora)

        this.btnHello.setOnClickListener{

            Log.d(TAG,"hello world calculadora")
            Toast.makeText(applicationContext,"hello world calculadora",Toast.LENGTH_LONG).show()
        }


    }
}
