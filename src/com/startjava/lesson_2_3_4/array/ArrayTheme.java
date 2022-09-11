package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {6, 4, 7, 2, 1, 3, 5};

        printArrayInt(intArr);

        int len = intArr.length;
        for (int i = 0; i <= len / 2; i++) {
            int tmp = intArr[--len];
            intArr[len] = intArr[i];
            intArr[i] = tmp;
        }

        System.out.println();
        printArrayInt(intArr);

        System.out.println("\n\n2. Вывод произведения элементов массива");

        intArr = new int[10];
        len = intArr.length;

        for (int i = 0; i < len; i++) {
            intArr[i] = i;
        }

        int mult = 1;
        for (int i = 1; i < len - 1; i++) {
            mult *= intArr[i];
            System.out.print(i < 8 ? i + " * " : i + " = " + mult);
        }

        System.out.println("\nзначение: " + intArr[0] + " имеет индекс - 0; " +
                "значение: " + intArr[9] + " имеет индекс - 9");

        System.out.println("\n3. Удаление элементов массива");

        float[] floatArr = new float[15];
        len = floatArr.length;
        Random random = new Random();

        for (int i = 0; i < len; i++) {
            floatArr[i] = random.nextFloat();
        }

        float middleValueArr = floatArr[len / 2];

        for (int i = 0; i < len; i++) {
            System.out.printf("%.3f ", floatArr[i]);
            if (i == 7) System.out.println();
        }

        int countZeroCell = 0;
        for (int i = 0; i < len; i++) {
            if (floatArr[i] > middleValueArr) {
                floatArr[i] = 0;
                countZeroCell++;
            }
        }

        System.out.println("\n");

        for (int i = 0; i < len; i++) {
            System.out.printf("%.3f ",floatArr[i]);
            if (i == 7) System.out.println();
        }

        System.out.println("\nКоличество обнуленных ячеек: " + countZeroCell);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");

        char[] engAlphabet = new char[26];
        len = engAlphabet.length;
        int index = 0;

        for (char letter = 'A'; letter <= 'Z'; letter++) {
            engAlphabet[index] = letter;
            index++;
        }

        int countLines = 0;
        while (countLines < len) {
            countLines++;
            for (int i = 1; i <= countLines; i++) {
                System.out.print(engAlphabet[len - i]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        intArr = new int[30];
        len = intArr.length;

        boolean flag = true;

        for (int i = 0; i < len; ) {
            int targetNum = random.nextInt(60, 100);

            for (int j = 0; j < len; j++) {
                if (intArr[j] == targetNum) {
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
        for (int num : intArr) {
            count++;
            System.out.print(num + " ");
            if (count % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n6. Сдвиг элементов массива");

        String[] arrString = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        len = arrString.length;

        int arrCopyLen = 0;
        for (String str : arrString) {
            if (!str.isBlank()) {
                arrCopyLen++;
            }
        }
        String[] arrStringCopy = new String[arrCopyLen];

        int destPos = 0;
        int srcPos = 0;
        int elementsNumber = 0;
        for (int i = 0; i < len; i++) {
            if (arrString[i].isBlank()) {
                srcPos++;
                continue;
            } else {
                while (!arrString[i].isBlank()) {
                    elementsNumber++;
                    i++;
                }
                System.arraycopy(arrString, srcPos, arrStringCopy, destPos, elementsNumber);
                srcPos = i;
                i--;
                destPos += elementsNumber;
                elementsNumber = 0;
            }
        }

        printArrayString(arrString);
        System.out.println();
        printArrayString(arrStringCopy);
    }

    private static void printArrayInt(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    private static void printArrayString(String[] array) {
        for (String elem : array) {
            System.out.print(elem + " ");
        }
    }
}