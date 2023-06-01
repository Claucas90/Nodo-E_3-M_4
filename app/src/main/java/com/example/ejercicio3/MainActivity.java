package com.example.ejercicio3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumber1;
    private EditText editTextNumber2;
    private Button buttonAdd;
    private Button buttonSubtract;
    private Button buttonMultiply;
    private Button buttonDivide;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSubtract = findViewById(R.id.buttonSubtract);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonDivide = findViewById(R.id.buttonDivide);
        textViewResult = findViewById(R.id.textViewResult);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performAddition();
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performSubtraction();
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performMultiplication();
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performDivision();
            }
        });
    }

    private void performAddition() {
        int number1 = Integer.parseInt(editTextNumber1.getText().toString());
        int number2 = Integer.parseInt(editTextNumber2.getText().toString());
        int result = number1 + number2;
        textViewResult.setText(String.valueOf(result));
    }

    private void performSubtraction() {
        int number1 = Integer.parseInt(editTextNumber1.getText().toString());
        int number2 = Integer.parseInt(editTextNumber2.getText().toString());
        int result = number1 - number2;
        textViewResult.setText(String.valueOf(result));
    }

    private void performMultiplication() {
        int number1 = Integer.parseInt(editTextNumber1.getText().toString());
        int number2 = Integer.parseInt(editTextNumber2.getText().toString());
        int result = number1 * number2;
        textViewResult.setText(String.valueOf(result));
    }

    private void performDivision() {
        int number1 = Integer.parseInt(editTextNumber1.getText().toString());
        int number2 = Integer.parseInt(editTextNumber2.getText().toString());
        if (number2 != 0) {
            int result = number1 / number2;
            textViewResult.setText(String.valueOf(result));
        } else {
            textViewResult.setText("Error: No se puede dividir por cero");
        }
    }
}
