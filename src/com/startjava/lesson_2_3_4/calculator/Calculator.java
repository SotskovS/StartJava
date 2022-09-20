
package com.startjava.lesson_2_3_4.calculator;

class Calculator {

    private static int a;
    private static int b;
    private static char sign;

    public static int calculate(String userExpression) {
        String[] partsExpression = userExpression.split(" ");
        a = Integer.parseInt(partsExpression[0]);
        sign = partsExpression[1].charAt(0);
        b = Integer.parseInt(partsExpression[2]);

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