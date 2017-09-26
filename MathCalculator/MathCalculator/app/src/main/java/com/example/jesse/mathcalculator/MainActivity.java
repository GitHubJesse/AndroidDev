package com.example.jesse.mathcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

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

        setupUIButtons();

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
                ioBufferTextView.setText(ioBufferTextView.getText().toString()+"+");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioBufferTextView.setText(ioBufferTextView.getText().toString()+"-");
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioBufferTextView.setText(ioBufferTextView.getText().toString()+"*");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioBufferTextView.setText(ioBufferTextView.getText().toString()+"/");
            }
        });
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioBufferTextView.setText(ioBufferTextView.getText().toString()+".");
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
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioBufferTextView.setText("");
            }
        });
    }

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
}

