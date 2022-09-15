package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int a;
    private int b;
    private char sign;

    public int calculate(String userExpression) {
        String[] arrStringExpression = userExpression.split(" ");
        a = Integer.parseInt(arrStringExpression[0]);
        sign = arrStringExpression[1].charAt(0);
        b = Integer.parseInt(arrStringExpression[2]);

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
