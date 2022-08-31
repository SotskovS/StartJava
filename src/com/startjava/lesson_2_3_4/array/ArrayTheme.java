package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {6, 4, 7, 2, 1, 3, 5};

        for (int num : intArr) {
            System.out.print(num + " ");
        }

        int len = intArr.length;

        for (int i = 0; i < len / 2; i++) {
            int tmp = intArr[len - 1 - i];
            intArr[len - i - 1] = intArr[i];
            intArr[i] = tmp;
        }

        System.out.println();
        for (int num : intArr) {
            System.out.print(num + " ");
        }

        System.out.println("\n\n2. Вывод произведения элементов массива");

        intArr = new int[10];
        len = intArr.length;

        for (int i = 0; i < len; i++) {
            intArr[i] = i;
        }

        int sum = 0;
        for (int i = 1; i < len - 1; i++) {
            sum += intArr[i];
            System.out.print(i < 8 ? i + " + " : i + " = ");
        }
        System.out.println(sum);

        System.out.println("значение: " + intArr[0] + " имеет индекс - 0; " +
                "значение: " + intArr[9] + " имеет индекс - 9");

        System.out.println("\n3. Удаление элементов массива");

        float[] floatArr = new float[15];
        len = floatArr.length;
        Random random = new Random();

        for (int i = 0; i < len; i++) {
            floatArr[i] = random.nextFloat(0.0f, 1.0f);
        }

        float middleIndexArr = floatArr[len / 2];

        for (int i = 0; i < len; i++) {
            System.out.printf("%s %.3f", "", floatArr[i]);
            if (i == 7) System.out.println();
        }

        int countZeroCell = 0;
        for (int i = 0; i < len; i++) {
            if (floatArr[i] > middleIndexArr) {
                floatArr[i] = 0;
                countZeroCell++;
            }
        }

        System.out.println("\n");

        for (int i = 0; i < len; i++) {
            System.out.printf("%s %.3f", "", floatArr[i]);
            if (i == 7) System.out.println();
        }

        System.out.println("\nКоличество обнуленных ячеек: " + countZeroCell);

//        System.out.printf("%.3f", 4.12345);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");

        char[] charArr = new char[26];
        len = charArr.length;
        int index = 0;

        for (char letter = 'A'; letter <= 'Z'; letter++) {
            charArr[index] = letter;
            index++;
        }

        int countLines = 0;
        while (countLines < len) {
            countLines++;
            for (int i = 1; i <= countLines; i++) {
                System.out.print(charArr[len - i]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        intArr = new int[30];
        len = intArr.length;

        boolean flag = true;

        for (int i = 0; i < len; ) {
            int targetNum = random.nextInt(60, 100);

            for (int k = 0; k < len; ++k) {
                if (intArr[k] == targetNum) {
                    flag = false;
                }
            }

            if (flag) {
                intArr[i] = targetNum;
                i++;
            }
            flag = true;
        }

        for (int i = len - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    int tmp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = tmp;
                }
            }
        }

        int count = 0;
        for (int g : intArr) {
            count++;
            System.out.print(g + " ");
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
}