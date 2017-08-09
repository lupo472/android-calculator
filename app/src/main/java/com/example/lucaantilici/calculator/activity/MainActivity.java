package com.example.lucaantilici.calculator.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.lucaantilici.calculator.R;
import com.example.lucaantilici.calculator.logic.Calculator;

public class MainActivity extends AppCompatActivity {
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8,btn9, btnDelete,btnEqual, btnPlus, btnMinus, btnMult, btnDiv,btnDot, btnClear;
    private TextView textView;
    private Calculator calculator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculator = Calculator.getInstance();

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMult = (Button) findViewById(R.id.btnMult);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnDelete = (Button) findViewById(R.id.btnDelete);

        textView = (TextView) findViewById(R.id.numberInput);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                textView.append(btn0.getText().toString());
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                textView.append(btn1.getText().toString());
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                textView.append(btn2.getText().toString());
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                textView.append(btn3.getText().toString());
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                textView.append(btn4.getText().toString());
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                textView.append(btn5.getText().toString());
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                textView.append(btn6.getText().toString());
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                textView.append(btn7.getText().toString());
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                textView.append(btn8.getText().toString());
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                textView.append(btn9.getText().toString());
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String textViewString = btnDot.getText().toString();
                textView.append(textViewString);
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Double numberOne = getEditTextNumberValue();
                calculator.add(numberOne);
                textView.setText("");
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTextNumber = textView.getText().toString();
                Double numberTwo = Double.parseDouble(editTextNumber);
                Double result = calculator.calculate(numberTwo);
                textView.setText("");
                textView.append(String.valueOf(result));
                calculator.reset();
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                calculator.reset();
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double numberOne = getEditTextNumberValue();
                calculator.minus(numberOne);
                textView.setText("");
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double numberOne = getEditTextNumberValue();
                calculator.multiply(numberOne);
                textView.setText("");
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double numberOne = getEditTextNumberValue();
                calculator.divide(numberOne);
                textView.setText("");
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numberInput = textView.getText().toString();
                String numberInputDelete = "";
                if(!"".equals(numberInput)) {
                    numberInputDelete = numberInput.substring(0, numberInput.length() - 1);
                }
                textView.setText(numberInputDelete);
            }
        });

    }

    private Double getEditTextNumberValue() {
        String textViewNumber = textView.getText().toString();
        if(!"".equals(textViewNumber)) {
            Double numberOne = Double.parseDouble(textViewNumber);
            return numberOne;
        } else {
            return Double.valueOf(0);
        }
    }

}
