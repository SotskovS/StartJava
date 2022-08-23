package com.startjava.lesson_2_3_4.array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayTheme {
    public static void main(String[] args) {
//        int[] intArr = {6, 4, 7, 2, 1, 3, 5};
//
//        for (int x : intArr) {
//            System.out.print(x + " ");
//        }
//
//        int lengthArr = intArr.length;
//        int tmp;
//        for (int i = 0; i < lengthArr / 2; i++) {
//            tmp = intArr[lengthArr - i - 1];
//            intArr[lengthArr - i - 1] = intArr[i];
//            intArr[i] = tmp;
//        }
//
//        System.out.println();
//        for (int x : intArr) {
//            System.out.print(x + " ");
//        }

        int[] intArr = new int[10];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i;
        }

        int sum = 0;
        for (int i = 1; i < intArr.length - 1; i++) {
            sum += intArr[i];
            System.out.print(i < 8 ? i + " + " : i + " = ");
        }
        System.out.println(sum);

        int indexFirst = 0;
        int indexLast = 0;
        for (int index : intArr) {
            if (intArr[index] == 0) {
                indexFirst = index;
            } else if (intArr[index] == 9) {
                indexLast = index;
            }
        }

        System.out.println("значение: " + intArr[0] + " имеет индекс - " + indexFirst + "; " +
                "значение: " + intArr[9] + " имеет индекс - " + indexLast);

    }
}


//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Inter length array: ");
//        int maxLength = scan.nextInt();
//        int[] numbers = new int[maxLength];
//
//        System.out.print("Full array ");
//
//        for (int i = 0; i < maxLength; i++) {
//            numbers[i] = scan.nextInt();
//        }
//
//        int max = numbers[0];
//
//        for (int i = 0; i < maxLength - 1; i++) {
//            if(max < numbers[i + 1]) {
//                max = numbers[i + 1];
//            }
//        }
//
//        for (int i : numbers) {
//            System.out.println(i);
//        }
//        System.out.println(max);
//    }
//}