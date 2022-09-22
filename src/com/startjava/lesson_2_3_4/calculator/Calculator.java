package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static int calculate(String userExpression) {
        String[] partsExpression = userExpression.split(" ");

        int a = 0;
        char sign = partsExpression[1].charAt(0);
        int b = 0;

        try {
            a = Integer.parseInt(partsExpression[0]);
            b = Integer.parseInt(partsExpression[2]);
            if (a < 0 || b < 0) {
                throw new Exception();
            }
            if ((sign == '/' && b == 0)) {
                System.out.println("На 0 делить нельзя!");
            } else {
                switch (sign) {
                    case '+': return a + b;
                    case '-': return a - b;
                    case '*': return a * b;
                    case '%': return a % b;
                    case '^': return (int) Math.pow(a, b);
                    case '/': return (b == 0 ? 0 : a / b);
                }
            }
        } catch (Exception e) {
            System.out.println("Введены не корректные значения");
        }
        return 0;
    }
}
