package com.example.jesse.mathcalculator;

/**
 * Created by Jesse on 2017-09-26.
 */

public class Calculator {

    //Create Global Variable for calculation
    public double leftValue;
    public double rightValue;
    public double result;

    public String calculateResult(String operator){
        switch (operator){
            case "+":
                result = leftValue + rightValue;
                break;
            case "-":
                break;
            case "*":
                result = leftValue * rightValue;
                break;
            case "/":
                break;
        }

        String resultString = Double.toString(result);
        return resultString;
    }
}
