package com.example.jesse.mathcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Create Global Variable for calculation
    private String leftValueBuffer;
    private String rightValueBuffer;
    private boolean leftValueFilled = false;
    private double leftValue = 0;
    private double rightValue = 0;
    private String operator;
    private double result;

    //Initialize all buttons and TextViews
    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button add;
    private Button sub;
    private Button multi;
    private Button div;
    private Button dec;
    private Button del;
    private Button negative;
    private Button clear;
    private Button equals;
    private TextView ioBufferTextView;
    private TextView ioResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link each button to it's corresponding variable
        setupUIButtons();

        //ONCLICK LISTENERS FOR BUTTONS//

        zero.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
                ioBufferTextView.setText(ioBufferTextView.getText().toString()+"0");
           }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioBufferTextView.setText(ioBufferTextView.getText().toString()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioBufferTextView.setText(ioBufferTextView.getText().toString()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioBufferTextView.setText(ioBufferTextView.getText().toString()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioBufferTextView.setText(ioBufferTextView.getText().toString()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioBufferTextView.setText(ioBufferTextView.getText().toString()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioBufferTextView.setText(ioBufferTextView.getText().toString()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioBufferTextView.setText(ioBufferTextView.getText().toString()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioBufferTextView.setText(ioBufferTextView.getText().toString()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioBufferTextView.setText(ioBufferTextView.getText().toString()+"9");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                useOperator("+");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                useOperator("-");
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                useOperator("*");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                useOperator("/");
            }
        });
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ioBufferTextView.getText().toString().contains(".")){
                    ioBufferTextView.setText(ioBufferTextView.getText().toString()+".");
                }
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioBufferTextView.setText(ioBufferTextView.getText().toString()+"");
            }
        });
        negative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioBufferTextView.setText(ioBufferTextView.getText().toString()+"-");
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioBufferTextView.setText(ioBufferTextView.getText().toString()+"=");
                calculateResult();
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "";
                leftValueBuffer = "";
                rightValueBuffer = "";
                leftValueFilled = false;
                leftValue = 0;
                rightValue = 0;
                ioBufferTextView.setText("");
                ioResultTextView.setText("0");
            }
        });
    }

    //Assign each button id to a var
    private void setupUIButtons(){
        zero = (Button)findViewById(R.id.btn0);
        one = (Button)findViewById(R.id.btn1);
        two = (Button)findViewById(R.id.btn2);
        three = (Button)findViewById(R.id.btn3);
        four = (Button)findViewById(R.id.btn4);
        five = (Button)findViewById(R.id.btn5);
        six = (Button)findViewById(R.id.btn6);
        seven = (Button)findViewById(R.id.btn7);
        eight = (Button)findViewById(R.id.btn8);
        nine = (Button)findViewById(R.id.btn9);
        add = (Button)findViewById(R.id.btnAdd);
        sub = (Button)findViewById(R.id.btnSub);
        multi = (Button)findViewById(R.id.btnMulti);
        div = (Button)findViewById(R.id.btnDiv);
        dec = (Button)findViewById(R.id.btnDec);
        del = (Button)findViewById(R.id.btnDel);
        negative = (Button)findViewById(R.id.btnNegative);
        clear = (Button)findViewById(R.id.btnClear);
        equals = (Button)findViewById(R.id.btnEquals);
        ioBufferTextView = (TextView)findViewById(R.id.ioBufferTextView);
        ioResultTextView = (TextView)findViewById(R.id.ioResultTextView);
    }

    private void useNumber(String n){
        if (leftValueFilled){
            rightValueBuffer += n;
            rightValue = Double.parseDouble(rightValueBuffer);
        }else{
            leftValueBuffer += n;
            leftValue = Double.parseDouble(leftValueBuffer);
        }
    }

    /*Is called every time an operator is called.
        Pushes existing value into the Left Value if empty.
        If left value isn't empty, calculate the output using the current value and operator.
    */
    private void useOperator(String o){
        operator = o;
        String currentValue = ioBufferTextView.getText().toString();
        ioBufferTextView.setText(currentValue+" "+o+" ");
        if(leftValueFilled){
            calculateResult();
        }else{
            leftValueFilled = true;
        }
    }

    private void calculateResult(){
        switch (operator){
            case "+":
                result = leftValue + rightValue;
                break;
            case "-":
                break;
            case "*":
                break;
            case "/":
                break;
        }

        String resultString = Double.toString(result);
        ioResultTextView.setText(resultString);
    }
}

