package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int a;
    private int b;
    private String sign;
    private int result;

    public void arrExpression(String[] arrExpression) {
        this.a = Integer.parseInt(arrExpression[0]);
        this.sign = arrExpression[1];
        this.b = Integer.parseInt(arrExpression[2]);
    }

    public int calculate() {

        if (b == 0) {
            System.out.println("На 0 делить нельзя");            
        } else {
            switch (sign) {
                case "+": result = a + b;
                          break;
                case "-": result = a - b;
                          break;
                case "*": result = a * b;
                          break;
                case "/": result = a / b;
                          break;
                case "%": result = a % b;
                          break;
                case "^": result = (int) Math.pow(a, b);
                          break;
            }
        }
        return result;
    };
}
