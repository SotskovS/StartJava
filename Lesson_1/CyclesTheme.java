public class CyclesTheme {
    
    public static void main(String[] args) {
     
        System.out.println("1. Подсчет суммы четных и нечетных чисел");       
        int num = -10;
        int sumEven = 0;
        int sumOdd = 0;

        do {
            if (num % 2 == 0) {
                sumEven += num;
                num++;
            } else  {
                sumOdd += num;                
                num++;
            }
        } while (num <= 21);

        System.out.println("Сумма четных чисел: " + sumEven + 
                           "\nСумма нечетных чисел: " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале между (max и min)");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;

        int max = num1;
        int min = num1;

        if (max < num2) { max = num2; };
        if (max < num3) { max = num3; };

        if (min > num2) { min = num2; };
        if (min > num3) { min = num3; };
        
        for (int i = max; i >= min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");

        num = 1234;
        int tmp;
        int sum = 0;

        while (num > 0) {
            tmp = num % 10;
            sum += tmp;
            num /= 10;
            System.out.print(tmp);
        }
        
        System.out.println("\n" + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");

        int endNum = 24;
        int numPosition = 0;
        
        for (int i = 1; i < endNum; i = i + 2) {
            numPosition++;            

            if (numPosition <= 5) {
                System.out.print(i + " ");
            } else if (numPosition == 6) {
                System.out.println("\n");
            }

            if (numPosition > 6 && numPosition <= 11) {
                System.out.print(i + " ");
            } else if (numPosition == 12) {
                System.out.println("\n");
            }

            if (numPosition > 11 && numPosition <= endNum) {
                System.out.print(i + " ");
            }            
        }

        if ((numPosition/ 2 - 1) <= 15) {           
            for (int i = 0; i < (15 - (endNum / 2 - 1)); i++ ) {                             
                System.out.print(0 + " ");
            }             
        }    

        System.out.println("\n\n5. Проверка количества единиц на четность");

        int baseNum = 3141591;
        int numOne = 0;
        int countNumOne = 0;
        num = baseNum;

        while (num > 0) {
            numOne = num % 10;
            num = num / 10;

            if (numOne == 1) {
                countNumOne++;
            }
        }

        if (countNumOne % 2 == 0) {
            System.out.println("Число " + baseNum + " содержит " + countNumOne + 
                               " единиц(ы)");
        } else {
            System.out.println("Число " + baseNum + " содержит " + countNumOne + 
                               " единиц(ы)");
        }

        System.out.println("\n6. Отображение фигур в консоли");

        for (int i = 1; i <= 50; i++ ) {
            
            System.out.print("*");

            if (i != 0 && i % 10 == 0) {                
                System.out.println("");
            }
        }

        System.out.println("");

        int line = 0;
        int count;        

        while (line < 5) {
            line++;
            count = 6 - line;   

            while (count > 0) {
                System.out.print("#");                
                count--;
            }             
        
            System.out.println("");
        }

        System.out.println("");

        // line = 1;        
        // count = 0;
        // int countMax = 3;

        // do {

        //     count = 0;
           
        //     do {                
        //         System.out.print("$");
        //         count++;
        //         if (count == countMax - 1) {
        //             break;
        //         }
        //     } while (count < line);
            
           
        // System.out.println("");    
        //     line++;
        // } while(line < 5);
        
        System.out.println("\n7. Отображение ASCII-символов");       

        for (int i = 1; i < 48; i++ ) {
            if (i % 2 != 0) {
                System.out.format("%20s", "Dec: " + i + " - Char: " + (char)i + "\n");
            }
        }

        for (int i = 97; i < 123; i++ ) {
            if (i % 2 == 0) {
                System.out.format("%20s", "Dec: " + i + " - Char: " + (char)i + "\n");
            }
        }        

        System.out.println("\n8. Проверка, является ли число палиндромом"); 

        boolean palindrom = false;

        num = 1234321;
        
        
        sum = 0;

        while (num > 0) {
            tmp = num % 10;
            sum += tmp;
            num /= 10;
            System.out.print(tmp);
        }
        

        
    }
}