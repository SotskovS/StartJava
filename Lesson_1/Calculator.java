public class Calculator {

    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        char sign = '%';
        int result = 1;

        if (b == 0) {
            System.out.println("На 0 делить нельзя");            
        } else {
            if (sign == '+') {
                result = a + b;            
            } else if (sign == '-') {
                result = a - b;            
            } else if (sign == '*') {
                result = a * b;            
            } else if (sign == '/') {
                result = a / b;            
            } else if (sign == '^') {
                for (int i = 1; i <= b; i++) {                
                    result *= a;                
                }
            } else if (sign == '%') {
                result = a % b;            
            }
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }
    }
}