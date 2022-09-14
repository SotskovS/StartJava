package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int a;
    private int b;
    private char sign;

    public int calculate(String[] arrExpression) {
        a = Integer.parseInt(arrExpression[0]);
        sign = arrExpression[1].charAt(0);
        b = Integer.parseInt(arrExpression[2]);

        if (b == 0) {
            System.out.println("На 0 делить нельзя");            
        } else {
            switch (sign) {
                case '+': return a + b;
                case '-': return a - b;
                case '*': return a * b;
                case '/': return a / b;
                case '%': return a % b;
                case '^': return (int) Math.pow(a, b);
            }
        }
        return 0;
    }
}
