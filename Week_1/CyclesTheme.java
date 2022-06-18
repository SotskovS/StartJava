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

        int a = 10;
        int b = 5;
        int c = -1;

        int max = a;
        int min = a;

        if (max < b) { max = b; };
        if (max < c) { max = c; };

        if (min > b) { min = b; };
        if (min > c) { min = c; };
        
        for (int i = max-1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");

        num = 1234;
        int x;
        int sum = 0;

        while (num > 0) {
            x = num % 10;
            sum += x;
            num /= 10;
            System.out.print(x);
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


        



    }
}