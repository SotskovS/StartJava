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
            System.out.println("Имя начинается не на \"М\" и не на \"I\"\n");
        }

        int numOne = 4;
        int numTwo = 6;

        if (numOne > numTwo) {
            System.out.println("Число max: " + numOne + "; " + "Число min: " + numTwo);
        } else {
            System.out.println("Число max: " + numTwo + "; " + "Число min: " + numOne);
        }
    }
}