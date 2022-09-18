package com.startjava.lesson_2_3_4.calculator;

import java.io.IOException;
import java.util.Scanner;

class Calc {
    public static int calculate(String userExpression) {
        String[] partsExpression = userExpression.split(" ");

        int a = 0;
        char sign = partsExpression[1].charAt(0);
        int b = 0;

        try {
            a = Integer.parseInt(partsExpression[0]);
            b = Integer.parseInt(partsExpression[2]);
            if (a < 0 || b < 0) {}
            if (b == 0) {}
        } catch (IllegalArgumentException e) {
            System.out.println("Введены не корректные значения");
        }

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
                default : throw new IllegalStateException("Unexpected value: " + sign);
            }
        }
        return 0;
    }
}

class CalculatorStatic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                System.out.println("Введите выражение в формате - \"a + b\" (число должно быть целым и положительным)");
                String mathExpression = scan.nextLine();
                System.out.println(Calc.calculate(mathExpression));
            }

            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scan.nextLine();
        } while (!"no".equals(answer));
    }
}