public class IfElseStatementTheme {
    
    public static void main(String[] args) {
        int age = 25;
        boolean man = true;
        float height = 1.7f;

        if (age > 20) {
            System.out.println("Взрослый");
        } else {
            System.out.println("Молодой");
        }

        if (!man) {
            System.out.println("Женщина");
        }

        if (height < 1.8) {
            System.out.println("Среднего роста");
        } else {
            System.out.println("Высокий");
        }

        char firstLatterName = "Max".charAt(0);
        if (firstLatterName == 'M') {
            System.out.println("Имя начинается на \"М\"");
        } else if (firstLatterName == 'I') {
            System.out.println("Имя начинается на \"I\"");
        } else {
            System.out.println("Имя начинается не на \"М\" и не на \"I\"");
        }

        System.out.println("");

        int numOne = 4;
        int numTwo = 6;

        if (numOne > numTwo) {
            System.out.println("Число max: " + numOne + "; " + "Число min: " + numTwo);
        } else {
            System.out.println("Число max: " + numTwo + "; " + "Число min: " + numOne);
        }

        System.out.println("");

        int num = -2;

        if (num == 0) {
            System.out.println("Число - 0");
        } else {
            if (num % 2 == 0) {
                System.out.println("Число - четное");
            } else {
                System.out.println("Число - нечетное");
            }

            if (num < 0) {
                System.out.println("Число - отрицательное");
            } else {
                System.out.println("Число - положительное");
            }
        }

        System.out.println("");

        
    }
}