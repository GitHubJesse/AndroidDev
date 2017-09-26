package com.example.jesse.mathcalculator;

/**
 * Created by Jesse on 2017-09-26.
 */

public class Calculator {
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
