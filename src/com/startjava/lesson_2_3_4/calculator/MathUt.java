package com.startjava.lesson_2_3_4.calculator;


class Main {
    public static void main(String[] args) {
        System.out.println("Res: " + MathUt.suMOfInits(1, 2, 3));
    }
}


public class MathUt {
    public static int suMOfInits(int i, int...nums) {
        int sum = i;

        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}


