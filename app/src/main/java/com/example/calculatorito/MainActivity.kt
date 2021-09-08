package com.example.calculatorito

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.exp

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) { }

        setContentView(R.layout.activity_main)

        oneButton.setOnClickListener{ calculate("1") }
        twoButton.setOnClickListener{ calculate("2") }
        threeButton.setOnClickListener{ calculate("3") }
        fourButton.setOnClickListener{ calculate("4") }
        fiveButton.setOnClickListener{ calculate("5") }
        sixButton.setOnClickListener{ calculate("6") }
        sevenButton.setOnClickListener{ calculate("7") }
        eightButton.setOnClickListener{ calculate("8") }
        nineButton.setOnClickListener{ calculate("9") }
        dotButton.setOnClickListener{ calculate(".") }

        addButton.setOnClickListener{calculate("+")}
        mulButton.setOnClickListener{calculate("-")}
        mulButton.setOnClickListener{calculate("*")}
        addButton.setOnClickListener{calculate("/")}
        addButton.setOnClickListener{calculate("%")}
        addButton.setOnClickListener{calculate("=")}

        delButton.setOnClickListener {

            var string = expression.text.toString()
            if(string.isNotEmpty()){
                expression.text = expression.text.substring(0,string.length-1);
            }
            result.text = "";

        }

        clearButton.setOnClickListener {
            result.text = ""
            expression.text = ""
        }

    }

    fun calculate( string:String): String {

        expression.append(string)



        return ""
    }


}