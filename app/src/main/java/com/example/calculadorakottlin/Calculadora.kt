package com.example.calculadorakottlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.calculadora.*

class Calculadora : AppCompatActivity() {

    val TAG ="hello"

    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculadora)

        this.btn_one.setOnClickListener{

            Log.d(TAG,"one")
            Toast.makeText(applicationContext,"one",Toast.LENGTH_LONG).show()
        }

       this.btn_two.setOnClickListener {
           Log.d(TAG,"two")
           Toast.makeText(applicationContext,"two",Toast.LENGTH_LONG).show()
       }

        this.btn_tree.setOnClickListener {
            Log.d(TAG,"tree")
            Toast.makeText(applicationContext,"tree",Toast.LENGTH_LONG).show()
        }

        this.btn_four.setOnClickListener {
            Log.d(TAG,"four")
            Toast.makeText(applicationContext,"four",Toast.LENGTH_LONG).show()
        }
        this.btn_five.setOnClickListener {
            Log.d(TAG,"five")
            Toast.makeText(applicationContext,"five",Toast.LENGTH_LONG).show()
        }
        this.btn_six.setOnClickListener {
            Log.d(TAG,"six")
            Toast.makeText(applicationContext,"six",Toast.LENGTH_LONG).show()
        }
        this.btn_seven.setOnClickListener {
            Log.d(TAG,"seven")
            Toast.makeText(applicationContext,"seven",Toast.LENGTH_LONG).show()
        }
        this.btn_eigth.setOnClickListener {
            Log.d(TAG,"eigth")
            Toast.makeText(applicationContext,"eigth",Toast.LENGTH_LONG).show()
        }
        this.btn_nine.setOnClickListener {
            Log.d(TAG,"nine")
            Toast.makeText(applicationContext,"nine",Toast.LENGTH_LONG).show()
        }
        this.btn_cero.setOnClickListener {
            Log.d(TAG,"cero")
            Toast.makeText(applicationContext,"cero",Toast.LENGTH_LONG).show()
        }
        this.btn_plus.setOnClickListener {
            Log.d(TAG,"mas")
            Toast.makeText(applicationContext,"mas",Toast.LENGTH_LONG).show()
        }
        this.btn_minus.setOnClickListener {
            Log.d(TAG,"minus")
            Toast.makeText(applicationContext,"minus",Toast.LENGTH_LONG).show()
        }
        this.btn_dot.setOnClickListener {
            Log.d(TAG,"dot")
            Toast.makeText(applicationContext,"dot",Toast.LENGTH_LONG).show()
        }
        this.btn_multiplicar.setOnClickListener {
            Log.d(TAG,"multiplicar")
            Toast.makeText(applicationContext,"multiplicar",Toast.LENGTH_LONG).show()
        }
        this.btn_division.setOnClickListener {
            Log.d(TAG,"division")
            Toast.makeText(applicationContext,"division",Toast.LENGTH_LONG).show()
        }
        this.btn_equals.setOnClickListener {
            Log.d(TAG,"equals")
            Toast.makeText(applicationContext,"equals",Toast.LENGTH_LONG).show()
        }



    }
}


