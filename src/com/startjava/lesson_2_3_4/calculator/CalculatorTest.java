package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                System.out.println("Введите выражение в формате - \"a + b\": ");
                String mathExpression = scan.nextLine();
                System.out.println(Calculator.calculate(mathExpression));
            }

            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scan.nextLine();
        } while (!"no".equals(answer));
    }
}