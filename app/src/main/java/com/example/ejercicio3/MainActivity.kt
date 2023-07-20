package com.example.ejercicio3

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var editTextNumber1: EditText? = null
    private var editTextNumber2: EditText? = null
    private var buttonAdd: Button? = null
    private var buttonSubtract: Button? = null
    private var buttonMultiply: Button? = null
    private var buttonDivide: Button? = null
    private var textViewResult: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextNumber1 = findViewById(R.id.editTextNumber1)
        editTextNumber2 = findViewById(R.id.editTextNumber2)
        buttonAdd = findViewById(R.id.buttonAdd)
        buttonSubtract = findViewById(R.id.buttonSubtract)
        buttonMultiply = findViewById(R.id.buttonMultiply)
        buttonDivide = findViewById(R.id.buttonDivide)
        textViewResult = findViewById(R.id.textViewResult)
           }

    private fun performAddition() {
        val number1 = editTextNumber1!!.text.toString().toInt()
        val number2 = editTextNumber2!!.text.toString().toInt()
        val result = number1 + number2
        textViewResult!!.text = result.toString()
    }

    private fun performSubtraction() {
        val number1 = editTextNumber1!!.text.toString().toInt()
        val number2 = editTextNumber2!!.text.toString().toInt()
        val result = number1 - number2
        textViewResult!!.text = result.toString()
    }

    private fun performMultiplication() {
        val number1 = editTextNumber1!!.text.toString().toInt()
        val number2 = editTextNumber2!!.text.toString().toInt()
        val result = number1 * number2
        textViewResult!!.text = result.toString()
    }

    private fun performDivision() {
        val number1 = editTextNumber1!!.text.toString().toInt()
        val number2 = editTextNumber2!!.text.toString().toInt()
        if (number2 != 0) {
            val result = number1 / number2
            textViewResult!!.text = result.toString()
        } else {
            textViewResult!!.text = "Error: No se puede dividir por cero"
        }
    }
}