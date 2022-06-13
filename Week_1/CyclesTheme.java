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
        
        System.out.println("\n" + sum + "\n");


    }
}