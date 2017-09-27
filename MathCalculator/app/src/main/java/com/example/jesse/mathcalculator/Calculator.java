package com.example.jesse.mathcalculator;

/**
 * Created by Jesse on 2017-09-26.
 */

public class Calculator {

    //Create Global Variable for calculation
    public double leftValue;
    public double rightValue;
    public  boolean leftNegative = false;
    public  boolean rightNegative = false;
    public double result;

    public String calculateResult(String leftVal, String operator, String rightVal){
        leftValue = Double.parseDouble(leftVal);
        rightValue = Double.parseDouble(rightVal);

        checkIfNegative();

        switch (operator){
            case "+":
                add();
                break;
            case "-":
                subtract();
                break;
            case "*":
                multiply();
                break;
            case "/":
                divide();
                break;
        }

        String resultString = Double.toString(result);
        return resultString;
    }

    public void add(){
        result = leftValue + rightValue;
    }

    public void subtract(){
        result = leftValue - rightValue;
    }

    public void divide(){
        result = leftValue / rightValue;
    }

    public void multiply(){
        result = leftValue * rightValue;
    }

    public void checkIfNegative(){
        if (leftNegative){
            leftValue = -leftValue;
        }
        if (rightNegative){
            rightValue = -rightValue;
        }
    }
}
