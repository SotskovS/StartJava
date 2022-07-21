public class CyclesTheme {
    
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;

        do {
            counter++;
            if (counter % 2 == 0) {
                sumEven += counter;
            } else  {
                sumOdd += counter;
            }
        } while (counter <= 21);

        System.out.println("Сумма четных чисел: " + sumEven + 
                "\nСумма нечетных чисел: " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале между (max и min)");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;

        int max = num1;
        int min = num1;

        if (max < num2) max = num2;
        if (max < num3) max = num3;

        if (min > num2) min = num2;
        if (min > num3) min = num3;
        
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");

        int srcNum = 1234;
        int digit;
        int sumDigits = 0;

        while (srcNum > 0) {
            digit = srcNum % 10;
            sumDigits += digit;
            srcNum /= 10;
            System.out.print(digit);
        }
        
        System.out.println("\n" + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");

        int endRange = 24;
        int numberDigitsInString = 0;
            
         for (int i = 1; i < endRange; i += 2) {
            numberDigitsInString++;
            System.out.printf("%3d", i);

            if (numberDigitsInString == 5) {
                System.out.println();
                numberDigitsInString = 0;
            }
        }
       
        for (int i = 0; i < 5 - numberDigitsInString; i++) {
            System.out.printf("%3d", 0);
        }

        System.out.println("\n\n5. Проверка количества единиц на четность");

        srcNum = 3141591;
        digit = 0;
        int countOnes = 0;
        int copySrcNum  = srcNum;

        while (copySrcNum  > 0) {
            digit = copySrcNum  % 10;
            copySrcNum /= 10;

            if (digit == 1) {
                countOnes++;
            }
        }       

        if (countOnes % 2 == 0) {
            System.out.println("Число " + srcNum + " содержит " + countOnes + 
                    " (четное) количество единиц");
        } else {
            System.out.println("Число " + srcNum + " содержит " + countOnes +
                    " (нечетное) количество единиц");
        }

        System.out.println("\n6. Отображение фигур в консоли");

        for (int i = 1; i <= 50; i++) {            
            System.out.print("*");

            if (i % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println();

        int countLines = 6;
        int countSymbols;        

        while (countLines > 0) {
            countLines--;
            countSymbols = countLines;   
            while (countSymbols > 0) {
                System.out.print("#");
                countSymbols--;
            }
        
            System.out.println();
        }

        System.out.println();

        countLines = 1;
        int j = 1;
        
        do {
            countLines++;
            countSymbols = 1;
            j +=1;

            if (countLines > 4) {
                j = 3;
                countSymbols = 1;
            } 

            if (countLines > 5) {
                j = 1;
                countSymbols = 0;
            }  

            do {
                System.out.print("$");
                countSymbols++;
            } while (countSymbols < j);

            System.out.println();
        } while (countLines <= 5);
            
        System.out.println("\n7. Отображение ASCII-символов");

        System.out.printf("%15s", "Dec  Char \n");

        for (int i = 1; i < 48; i++ ) {
            if (i % 2 != 0) {
                System.out.printf("%12s", + i + "   " + (char) i + "\n");
            }
        }

        for (int i = 97; i < 123; i++ ) {
            if (i % 2 == 0) {
                System.out.printf("%12s", + i + "   " + (char) i + "\n");
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");

        srcNum = 1234321;
        int tmp = srcNum;        
        int reversSrcNum = 0;
        
        while (tmp > 0) {
            int lastDigit = tmp % 10;
            reversSrcNum = reversSrcNum * 10 + lastDigit;
            tmp /= 10;
        }

        if (srcNum == reversSrcNum) {
            System.out.println("Число " + srcNum + " является палиндромом");
        } else {
            System.out.println("Число " + srcNum + " не является палиндромом");
        }
        
        System.out.println("\n9. Определение, является ли число счастливым");

        srcNum = 123321;
        tmp = srcNum;        
        int sumLastDigits = 0;
        counter = 6;
        sumDigits = 0;
        
        while (tmp > 0) {
            counter--;

            if (counter >= 3) {
                int lastDigit = tmp % 10;
                sumLastDigits = sumLastDigits + lastDigit;
                tmp /= 10;                
            } else {
                int lastDigit = tmp % 10;
                sumDigits = sumDigits + lastDigit;
                tmp /= 10;                
            }
        }

        System.out.println("Сумма цифр abc = " + sumLastDigits);
        System.out.println("Сумма цифр def = " + sumDigits);

        if (sumLastDigits == sumDigits) {
            System.out.println("Число " + srcNum + " является счастливым");
        } else {
            System.out.println("Число " + srcNum + " не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");

        System.out.print("  |");
        for (int i = 1; i < 10; i++) {
            System.out.printf("%3s", i);
        }

        System.out.println("\n__|___________________________");        

        for (int i = 2; i < 10; i++) {            
            System.out.print(i + " |");
            for (j = i; j < 10 * i; j += i) {
                System.out.printf("%3s", j);
            }

            System.out.println();
        }    
    }
}
