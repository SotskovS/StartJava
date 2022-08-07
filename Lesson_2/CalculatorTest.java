 import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        String userAnswer;

        do {
            System.out.print("Введите первое число: ");
            int a = scan.nextInt();
            calc.setA(a);
            
            System.out.print("Введите знак математической операции: ");
            char sign = scan.next().charAt(0);
            calc.setSign(sign);
            
            System.out.print("Введите второе число: ");
            int b = scan.nextInt();
            calc.setB(b);

            System.out.println(calc.calculate());

            boolean flag;
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                userAnswer = scan.next();
                
                if (userAnswer.equals("yes") || userAnswer.equals("no")) {                    
                    flag = false;
                } else {
                    flag = true;
                }
            } while (flag);
         } while(!userAnswer.equals("no"));
    }
}