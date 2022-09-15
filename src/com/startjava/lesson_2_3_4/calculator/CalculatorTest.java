package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);

        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                System.out.println("Введите выражение в формате - \"a + b\": ");
                String userExpression = scan.nextLine();
                System.out.println(calc.calculate(userExpression));
            }

            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scan.nextLine();
        } while (!"no".equals(answer));
    }
}