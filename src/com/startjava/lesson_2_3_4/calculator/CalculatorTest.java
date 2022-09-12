package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);

        String userAnswer;
        do {
            System.out.println("Введите выражение в формате - \"a + b\": ");
            String userExpression = scan.nextLine();
            String[] arrInt = userExpression.split(" ");

            calc.arrExpression(arrInt);
            System.out.println(calc.calculate());

            boolean flag;
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                userAnswer = scan.next();
                
                if (userAnswer.equals("yes") || userAnswer.equals("no")) {
                    flag = false;
                    scan.nextLine();
                } else {
                    flag = true;
                }
            } while (flag);
         } while(!userAnswer.equals("no"));
    }
}