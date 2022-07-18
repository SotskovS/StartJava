public class IfElseStatementTheme {
    
    public static void main(String[] args) {

        System.out.println("\n1. Перевод псевдокода на язык Java");
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

        System.out.println("\n2. Поиск max и min числа");

        int numOne = 6;
        int numTwo = 4;

        System.out.println("Имеется 2 числа: " + numOne + " и " + numTwo);

        if (numOne > numTwo) {
            System.out.println("Число max: " + numOne + "; " + "Число min: " + numTwo);
        } else {
            System.out.println("Число max: " + numTwo + "; " + "Число min: " + numOne);
        }

        System.out.println("\n3. Работа с числом");

        int num = -3;

        System.out.println("Исходное число: " + num);

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

        System.out.println("\n4. Поиск одинаковых цифр в числах");

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

        System.out.println("\n5. Определение буквы, числа или символа по их коду");

        char simbol = '\u0057';

        System.out.println(simbol + ": ");

        if (Character.isUpperCase(simbol)) {
            System.out.println("Символ - большая буква");
        } else {    
            System.out.println("Символ - маленькая буква");
        }

        if (Character.isDigit(simbol)) {
            System.out.println("Символ - число");
        } else {
            System.out.println("Символ - не число");
        }

        if (!Character.isLetter(simbol) && !Character.isDigit(simbol)) {
            System.out.println("Символ - не буква и не число");
        } 

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");

        int sum = 100_000;
        int rate = 0;
        int accrued = 0;
        int total = 0; 

        if (sum < 100_000) {            
            accrued = sum / 100 * 5;
        } else if (sum >= 100_000 && sum <= 300_000) {
            accrued = sum / 100 * 7;
        } else if (sum > 300_000) {
            accrued = sum / 100 * 10;
        } 

        total = sum + accrued;
            
        System.out.println("Сумма вклада: " + sum + ", " + 
                "Начисленный процент: " + accrued + ", " +
                "Итоговая сумма: " +  total);

        System.out.println("\n7. Определение оценки по предметам");

        int history = 59;
        int programming = 91;
        int resultHistory = 0;
        int resultProgramming = 0;
        int averageResult = 0;
        int averagePercent = 0;

        if (history > 91) {
            resultHistory = 5;
        } else if (history > 73) {
            resultHistory = 4;             
        } else if (history > 60) {
            resultHistory = 3;             
        } else if (history <= 60) {
            resultHistory = 2;             
        }

        if (programming > 91) {
            resultProgramming = 5;
        } else if (programming > 73) {
            resultProgramming = 4;             
        } else if (programming > 60) {
            resultProgramming = 3;             
        } else if (programming <= 60) {
            resultProgramming = 2;             
        }

        averageResult = (resultHistory + resultProgramming) / 2;

        averagePercent = (history + programming) / 2;

        System.out.println(resultHistory + " - История, " + resultProgramming + 
                " - Программирование \n" + "Средний балл: " + averageResult + 
                "\nСредний процент по предметам: " + averagePercent);

        System.out.println("\n8. Расчет прибыли");

        int rent = 5000;
        int averageSales = 13000;
        int productionCost = 9000;
        int annualProfit = 0;

        annualProfit = (averageSales - productionCost - rent) * 12;

        if (annualProfit > 0) {
            System.out.println("Прибыль за год: +" + annualProfit +" руб.");
        } else {
            System.out.println("Прибыль за год: " + annualProfit + " руб.");
        }

        System.out.println("\n9. Подсчет количества банкнот");

        sum = 567;

        int banknote100 = 0;
        int banknote10 = 0;
        int banknote1 = 0;
        int totalSum = 0;

        banknote100 = sum / 100;
        banknote10 = sum % 100 / 10;
        banknote1 = sum % 10;

        totalSum = banknote100 * 100 + banknote10 * 10 + banknote1; 

        if (banknote10 > 5) {
            banknote1 = (banknote10 - 5) * 10 + banknote1;
            
            System.out.println("Номиналы банкнот: 100USD, 10USD, 1USD \n" + 
                    "Количество: " + "100USD - " + banknote100 + 
                    ", 10USD - " + banknote10 + ", 1USD - " + banknote1 +
                    "\nИсходная сумма: " + totalSum + "USD");
        } else {
            System.out.println("Номиналы банкнот: 100USD, 10USD, 1USD \n" + 
                    "Количество: " + "100USD - " + banknote100 + 
                    ", 10USD - " + banknote10 + ", 1USD - " + banknote1 +
                    "\nИсходная сумма: " + totalSum + "USD");
        }
    }
}


