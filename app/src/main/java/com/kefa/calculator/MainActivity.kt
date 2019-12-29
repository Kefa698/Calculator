package com.kefa.calculator

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //btn for add
        var num1 = findViewById<EditText>(R.id.txtNum1)
        var num2: EditText = findViewById(R.id.txtNum2)

        var btnAdd:Button = findViewById<Button>(R.id.add)
        var result: TextView = findViewById(R.id.results)
        btnAdd.setOnClickListener {
            if (!num1.text.isEmpty()&& !num2.text.isEmpty()){
            //            get values ui view
            var x: Int = num1.text.toString().toInt()
            var y: Int = num2.text.toString().toInt()
            var sum: Int = x + y
//            use the above to convert from text to sting to int
            results.text = "The sum is $sum"

        }else {
                Toast.makeText(
                    this, "Input Num1 and Num2",
                    Toast.LENGTH_LONG
                ).show()
                num1.error = "Input num1"
                num2.error = "Input num2"

            }
        }
//        btn for subtraction
//        var numa = findViewById<EditText>(R.id.txtNum1)
//        var numb: EditText = findViewById(R.id.txtNum2)
        var btnSubstract:Button= findViewById<Button>(R.id.substract)
        var results: TextView = findViewById(R.id.results)
        btnSubstract.setOnClickListener {
            if (!num1.text.isEmpty()&& !num2.text.isEmpty()){
                //            get values ui view
                var x: Int = num1.text.toString().toInt()
                var y: Int = num2.text.toString().toInt()
                var substract: Int = x-y
//            use the above to convert from text to sting to int
                results.text = "The diff is $substract"
            }else {
                Toast.makeText(
                    this, "Input Num1 and Num2",
                    Toast.LENGTH_LONG
                ).show()
            }


        }
//        btn for division
//        var numc = findViewById<EditText>(R.id.txtNum1)
//        var numd: EditText = findViewById(R.id.txtNum2)
        var btnDivide:Button= findViewById<Button>(R.id.divide)
        var result_2: TextView = findViewById(R.id.results)
        btnDivide.setOnClickListener {
            if (!num1.text.isEmpty()&& !num2.text.isEmpty()){
            //            get values ui view
            var x: Int = num1.text.toString().toInt()
            var y: Int = num2.text.toString().toInt()
            var divide: Int =x/y
//            use the above to convert from text to sting to int
            results.text = "The quotient is $divide"
        }else {
                Toast.makeText(
                    this, "Input Num1 and Num2",
                    Toast.LENGTH_LONG
                ).show()

            }

        }
//        btn for multiplication
//        var nume = findViewById<EditText>(R.id.txtNum1)
//        var numf: EditText = findViewById(R.id.txtNum2)
        var btnMultiply:Button= findViewById<Button>(R.id.multiply)
        var result_3: TextView = findViewById(R.id.results)
        btnMultiply.setOnClickListener {
            if (!num1.text.isEmpty()&& !num2.text.isEmpty()){
            //            get values ui view
            var x: Int = num1.text.toString().toInt()
            var y: Int = num2.text.toString().toInt()
            var multiply: Int = x*y
//            use the above to convert from text to sting to int
            results.text = "The product is $multiply"
        }else {
                Toast.makeText(
                    this, "Input Num1 and Num2",
                    Toast.LENGTH_LONG
                ).show()

            }

        }
    }

}
