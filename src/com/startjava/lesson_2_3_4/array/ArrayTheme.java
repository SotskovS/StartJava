package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {6, 4, 7, 2, 1, 3, 5};

//        arrayToString(intArr);

        int len = intArr.length;

//        for (int i = 0; i < len / 2; i++) {
//            int tmp = intArr[len-- - 1];
//            intArr[len] = intArr[i];
//            intArr[i] = tmp;
//        }
//
//        System.out.println();
//        arrayToString(intArr);
//
//        System.out.println("\n\n2. Вывод произведения элементов массива");
//
//        intArr = new int[10];
//        len = intArr.length;
//
//        for (int i = 0; i < len; i++) {
//            intArr[i] = i;
//        }
//
//        int multi = 1;
//        for (int i = 1; i < len - 1; i++) {
//            multi *= intArr[i];
//            System.out.print(i < 8 ? i + " * " : i + " = ");
//        }
//        System.out.println(multi);
//
//        System.out.println("значение: " + intArr[0] + " имеет индекс - 0; " +
//                "значение: " + intArr[9] + " имеет индекс - 9");
//
//        System.out.println("\n3. Удаление элементов массива");
//
//        float[] floatArr = new float[15];
//        len = floatArr.length;
//        Random random = new Random();
//
//        for (int i = 0; i < len; i++) {
//            floatArr[i] = random.nextFloat(0.0f, 1.0f);
//        }
//
//        float middleIndexArr = floatArr[len / 2];
//
//        for (int i = 0; i < len; i++) {
//            System.out.printf("%1s %.3f", "", floatArr[i]);
//            if (i == 7) System.out.println();
//        }
//
//        int countZeroCell = 0;
//        for (int i = 0; i < len; i++) {
//            if (floatArr[i] > middleIndexArr) {
//                floatArr[i] = 0;
//                countZeroCell++;
//            }
//        }
//
//        System.out.println("\n");
//
//        for (int i = 0; i < len; i++) {
//            System.out.printf("%1s %.3f", "", floatArr[i]);
//            if (i == 7) System.out.println();
//        }
//
//        System.out.println("\nКоличество обнуленных ячеек: " + countZeroCell);
//
//        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
//
//        char[] charArr = new char[26];
//        len = charArr.length;
//        int index = 0;
//
//        for (char letter = 'A'; letter <= 'Z'; letter++) {
//            charArr[index] = letter;
//            index++;
//        }
//
//        int countLines = 0;
//        while (countLines < len) {
//            countLines++;
//            for (int i = 1; i <= countLines; i++) {
//                System.out.print(charArr[len - i]);
//            }
//            System.out.println();
//        }
//
//        System.out.println("\n5. Генерация уникальных чисел");
//        intArr = new int[30];
//        len = intArr.length;
//
//        boolean flag = true;
//
//        for (int i = 0; i < len; ) {
//            int targetNum = random.nextInt(60, 100);
//
//            for (int k = 0; k < len; ++k) {
//                if (intArr[k] == targetNum) {
//                    flag = false;
//                }
//            }
//
//            if (flag) {
//                intArr[i] = targetNum;
//                i++;
//            }
//            flag = true;
//        }
//
//        for (int i = len - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (intArr[j] > intArr[j + 1]) {
//                    int tmp = intArr[j];
//                    intArr[j] = intArr[j + 1];
//                    intArr[j + 1] = tmp;
//                }
//            }
//        }
//
//        int count = 0;
//        for (int g : intArr) {
//            count++;
//            System.out.print(g + " ");
//            if (count % 10 == 0) {
//                System.out.println();
//            }
//        }

        System.out.println("\n6. Сдвиг элементов массива");

        String[] arrString = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        len = arrString.length;

        int arrCopyLen = 0;
        for (String str : arrString) {
            if (!str.isBlank()) {
                arrCopyLen++;
            }
        }
        String[] arrCopy = new String[arrCopyLen];

        int destPos = 0;
        int srcPos = 0;
        int elementsNumber = 0;
        for (int i = 0; i < len; i++) {
            String s = arrString[i];
            if (s.isBlank()) {
                srcPos++;
                continue;
            } else {
                while (!s.isBlank()) {
                    elementsNumber++;
                    i++;
                }
                System.arraycopy(arrString, srcPos, arrCopy, destPos, elementsNumber);
                srcPos++;
                i--;
                destPos += elementsNumber;
                elementsNumber = 0;
            }
            for (String e : arrString) { System.out.print(e + " "); }
        }


//            boolean flag = true;
//            while (flag) {
//
//                if (srcPos < len - 1) {
//                    String s = arrString[srcPos++];
//                    if (!s.isBlank()) {
//                        lenTrain++;
//                    } else {
//                        flag = false;
//                    }
//                } else {
//                    flag = false;
//                }
//            }



//        System.arraycopy(arrString, ++ii, arrCopy, destPos, indexEnd);

//        for (String s : arrString) { System.out.print(s + " "); }
//        System.out.println();
//        for (String s : arrCopy) { System.out.print(s + " "); }

//  * 2й массив без пустых строк, вариант 1
//        for (int i = 0; i < len; i++) {
//            if (!arrString[i].isBlank()) {
//                System.arraycopy(arrString, i, arrCopy, destPos, 1);
//                destPos++;
//            }
//        }
    }
    private static void arrayToString(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

//    String[] srcArr = {"", "AA", "", "BBB", "CC", "D", "", "E", "FF", "G", ""};
//    int newArrLength = 0;
//        for(int i = 0; i < srcArr.length; i++) {
//        if(srcArr[i].isEmpty()) {
//        continue;
//        } else newArrLength++;
//        }
//        String[] destArr = new String[newArrLength];
//        int dest = 0;
//        int curr = 0;
//        elementsNumber = 0;
//        for(int i = 0; i < srcArr.length; i++) {
//        if (srcArr[i].isBlank()) {
//        curr++;
//        continue;
//        } else {
//        while (!srcArr[i].isBlank()) {
//        elementsNumber++;
//        i++;
//        }
//        System.arraycopy(srcArr, curr, destArr, dest, elementsNumber);
//        curr = i;
//        i--;
//        dest += elementsNumber;
//        elementsNumber = 0;
//        }
//        }
//        printStringArray(destArr); (отредактировано)