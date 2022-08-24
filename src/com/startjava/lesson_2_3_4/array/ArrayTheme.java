package com.startjava.lesson_2_3_4.array;

import java.text.DecimalFormat;
import java.util.Random;

public class ArrayTheme {
    public static void main(String[] args) {
        int lengthArr;
        System.out.println("1. Реверс значений массива");
        int[] intArr = {6, 4, 7, 2, 1, 3, 5};

        for (int x : intArr) {
            System.out.print(x + " ");
        }

        lengthArr = intArr.length;
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