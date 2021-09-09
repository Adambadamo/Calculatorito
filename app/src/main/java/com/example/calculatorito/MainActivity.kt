package com.example.calculatorito

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fathzer.soft.javaluator.DoubleEvaluator
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) { }

        setContentView(R.layout.activity_main)

        zeroButton.setOnClickListener { expressionBuilder("0") }
        oneButton.setOnClickListener{ expressionBuilder("1") }
        twoButton.setOnClickListener{ expressionBuilder("2") }
        threeButton.setOnClickListener{ expressionBuilder("3") }
        fourButton.setOnClickListener{ expressionBuilder("4") }
        fiveButton.setOnClickListener{ expressionBuilder("5") }
        sixButton.setOnClickListener{ expressionBuilder("6") }
        sevenButton.setOnClickListener{ expressionBuilder("7") }
        eightButton.setOnClickListener{ expressionBuilder("8") }
        nineButton.setOnClickListener{ expressionBuilder("9") }
        dotButton.setOnClickListener{ expressionBuilder(".") }

        addButton.setOnClickListener{expressionBuilder("+")}
        subButton.setOnClickListener{expressionBuilder("-")}
        mulButton.setOnClickListener{expressionBuilder("*")}
        divButton.setOnClickListener{expressionBuilder("/")}
        modButton.setOnClickListener{expressionBuilder("%")}

        eqButton.setOnClickListener{
            if(expression.text.isNotEmpty()){
            calculate(expression.text.toString())}
        }

        delButton.setOnClickListener {

            var string = expression.text.toString()
            if(string.isNotEmpty()){
                expression.text = expression.text.substring(0,string.length-1);
            }

        }

        clearButton.setOnClickListener {
            result.text = ""
            expression.text = ""
        }

    }

    fun expressionBuilder( string:String) {

        expression.append(string)

    }

    fun calculate(string: String){

        var evaluator = DoubleEvaluator()
        result.text = evaluator.evaluate(expression.text.toString()).toString()
    }

}