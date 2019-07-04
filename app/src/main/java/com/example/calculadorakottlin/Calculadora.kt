package com.example.calculadorakottlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.calculadora.*

class Calculadora : AppCompatActivity() {

    val TAG ="hello"

    val SUMA =1;
    val RESTA =2;
    val MULTIPLICACION =3;
    val DIVISION =4;
    val NO_OPERACION =0;


    var displayText: String =""
    var numero1:Int =0
    var numero2:Int =0
    var status =0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculadora)

        //

        this.btn_one.setOnClickListener{

            Log.d(TAG,"one")
            //Toast.makeText(applicationContext,"one",Toast.LENGTH_LONG).show()
            setDisplay(concat(displayText,"1"))
        }

       this.btn_two.setOnClickListener {
           Log.d(TAG,"two")
           setDisplay(concat(displayText,"2"))
       }

        this.btn_tree.setOnClickListener {
            Log.d(TAG,"tree")
            setDisplay(concat(displayText,"3"))
        }

        this.btn_four.setOnClickListener {
            Log.d(TAG,"four")
            setDisplay(concat(displayText,"4"))
        }
        this.btn_five.setOnClickListener {
            Log.d(TAG,"five")
            setDisplay(concat(displayText,"5"))
        }
        this.btn_six.setOnClickListener {
            Log.d(TAG,"six")
            setDisplay(concat(displayText,"6"))
        }
        this.btn_seven.setOnClickListener {
            Log.d(TAG,"seven")
            setDisplay(concat(displayText,"7"))
        }
        this.btn_eigth.setOnClickListener {
            Log.d(TAG,"eigth")
            setDisplay(concat(displayText,"8"))
        }
        this.btn_nine.setOnClickListener {
            Log.d(TAG,"nine")
            setDisplay(concat(displayText,"9"))
        }
        this.btn_cero.setOnClickListener {
            Log.d(TAG,"cero")
            setDisplay(concat(displayText,"0"))
        }
        this.btn_dot.setOnClickListener {
            Log.d(TAG,"dot")
            Toast.makeText(applicationContext,"dot",Toast.LENGTH_LONG).show()
        }
        this.btn_plus.setOnClickListener {
            Log.d(TAG,"mas")
            this.numero1=edt_display.text.toString().toInt()
            this.status = this.SUMA
            clear()


        }
        this.btn_minus.setOnClickListener {
            Log.d(TAG,"minus")
            this.numero1=edt_display.text.toString().toInt()
            this.status = this.RESTA
            clear()
        }

        this.btn_multiplicar.setOnClickListener {
            Log.d(TAG,"multiplicar")
            this.numero1=edt_display.text.toString().toInt()
            this.status = this.MULTIPLICACION
            clear()
        }
        this.btn_division.setOnClickListener {
            Log.d(TAG,"division")
            this.numero1=edt_display.text.toString().toInt()
            this.status = this.DIVISION
            clear()
        }
        this.btn_equals.setOnClickListener {
            Log.d(TAG,"equals")

            Log.d(TAG,"numero1 "+this.numero1)
            Log.d(TAG,"numero2 "+this.numero2)
            Log.d(TAG,"status "+this.status)
            //Toast.makeText(applicationContext,"equals",Toast.LENGTH_LONG).show()
            if(this.status !=this.NO_OPERACION){
                this.numero2=edt_display.text.toString().toInt()
                if(status==this.SUMA){
                    var result = numero1 +numero2;
                    setDisplay(result.toString())
                }else if(status == this.RESTA){
                    var result = numero1 -numero2;
                    setDisplay(result.toString())
                }else if(status ==this.MULTIPLICACION){
                    var result = numero1 *numero2;
                    setDisplay(result.toString())
                }else if(status == this.DIVISION){
                    var result = numero1/numero2;
                    setDisplay(result.toString())
                }
            }
        }



    }

    fun concat(display:String,new:String):String{

        this.displayText = display + new
        return displayText
    }

    fun setDisplay(result:String){
        this.edt_display.setText(result)
    }

    fun clear(){
        Log.d(TAG,"clear");
        this.displayText=""
        this.setDisplay(displayText)
    }

    fun setNumeroOne(num: Int){
        this.numero1 =num
    }

    fun setNumeroTwo(num: Int){
        this.numero2 =num
    }
}


