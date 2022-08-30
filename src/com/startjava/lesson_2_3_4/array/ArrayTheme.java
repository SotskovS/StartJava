package com.startjava.lesson_2_3_4.array;

import java.text.DecimalFormat;
import java.util.Random;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {6, 4, 7, 2, 1, 3, 5};

        for (int x : intArr) {
            System.out.print(x + " ");
        }

        int lengthArr = intArr.length;
        int tmp;
        for (int i = 0; i < lengthArr / 2; i++) {
            tmp = intArr[lengthArr - i - 1];
            intArr[lengthArr - i - 1] = intArr[i];
            intArr[i] = tmp;
        }

        System.out.println();
        for (int x : intArr) {
            System.out.print(x + " ");
        }

        System.out.println("\n\n2. Вывод произведения элементов массива");

        intArr = new int[10];

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

        System.out.println("\n3. Удаление элементов массива");

        float[] floatArr = new float[15];
        lengthArr = floatArr.length;
        Random random = new Random();
        DecimalFormat dF = new DecimalFormat("0.000");

        for (int i = 0; i < lengthArr; i++) {
            floatArr[i] = random.nextFloat(0.0f, 1.0f);
        }

        int middleIndexArr = lengthArr / 2;
        float numberInMiddleIndex = floatArr[middleIndexArr];

        for (int i = 0; i < lengthArr; i++) {
            System.out.printf("%6s", dF.format(floatArr[i]) + " ");
            if (i == 7) System.out.println();
        }

        int countZeroCell = -1;
        for (int i = 0; i < lengthArr; i++) {
            if (floatArr[i] > numberInMiddleIndex) {
                floatArr[i] = 0;
                countZeroCell++;
            }
        }

        System.out.println("\n");

        for (int i = 0; i < lengthArr; i++) {
            System.out.printf("%6s", dF.format(floatArr[i]) + " ");
            if (i == 7) System.out.println();
        }

        System.out.println("\nКоличество обнуленных ячеек: " + countZeroCell);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");

        char[] charArr = new char[26];
        lengthArr = charArr.length;
        int index = 0;

        for (char letter = 'A'; letter <= 'Z'; letter++) {
            charArr[index] = letter;
            index++;
        }

        int countLines = 0;
        while (countLines < lengthArr) {
            countLines++;
            for (int i = 1; i <= countLines; i++) {
                System.out.print(charArr[lengthArr - i]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        intArr = new int[30];
        lengthArr = intArr.length;

        boolean flag = true;

        for (int i = 0; i < lengthArr; ) {
            int targetNum = random.nextInt(60, 100);

            for (int k = 0; k < lengthArr; ++k) {
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

        for (int i = lengthArr - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    tmp = intArr[j];
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