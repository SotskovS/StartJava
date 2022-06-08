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

        numOne = 104;
        int numOne_X = numOne / 100;
        int numOne_Y = numOne % 100 / 10;
        int numOne_Z = numOne % 10;
        numTwo = 154;
        int numTwo_X = numTwo / 100;
        int numTwo_Y = numTwo % 100 / 10;
        int numTwo_Z = numTwo % 10;
        boolean a = false;
        boolean b = false;
        boolean c = false;

        if (numOne_X == numTwo_X) { a = true; }
        if (numOne_Y == numTwo_Y) { b = true; }
        if (numOne_Z == numTwo_Z) { c = true; }

        if (a && b && c) {
            System.out.println("В числах " + numOne + " и " + numTwo + 
                " одинаковые цифры " + numOne_X + ", " + numOne_Y + ", " +
                numOne_Z + " стоят в 1, 2, 3 разрядах");
        } else if (a && b) {
            System.out.println("В числах " + numOne + " и " + numTwo + 
                " одинаковые цифры " + numOne_X + ", " + numOne_Y +
                " стоят в 1, 2 разрядах");            
        } else if (b && c) {
            System.out.println("В числах " + numOne + " и " + numTwo + 
                " одинаковые цифры " + numOne_Y + ", " + numOne_Z +
                " стоят в 2, 3 разрядах");            
        } else if (a && c) {
            System.out.println("В числах " + numOne + " и " + numTwo + 
                " одинаковые цифры " + numOne_X + ", " + numOne_Z +
                " стоят в 1, 3 разрядах");            
        } else if (a) {
            System.out.println("В числах " + numOne + " и " + numTwo + 
                " одинаковые цифры \"" + numOne_X + "\" стоят в 1 разряде");            
        } else if (b) {
            System.out.println("В числах " + numOne + " и " + numTwo + 
                " одинаковые цифры \"" + numOne_Y + "\" стоят в 2 разряде");            
        } else if (c) {
            System.out.println("В числах " + numOne + " и " + numTwo + 
                " одинаковые цифры \"" + numOne_Z + "\" стоят в 3 разряде");            
        } 

    }
}