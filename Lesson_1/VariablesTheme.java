public class VariablesTheme {
    
    public static void main(String[] args) {

        System.out.println("\n1. Создание переменных и вывод их значений на консоль (это название задачи)");
        byte bitness = 64;
        short cointMonitor = 2;
        int codeProduct = 00326; 
        long buildOS = 190441706L;
        float wightPC = 10.2f;
        double weightMouse = 0.127;        
        char namePC = 'a';
        boolean windowsOS = true;

        System.out.println("bitness: " + bitness + "\n" + "cointMonitor: " + cointMonitor + "\n" +
                           "codeProduct: " + codeProduct + "\n" + "buildOS: " + buildOS + "\n" +
                           "wightPC: " + wightPC + "\n" + "weightMouse: " + weightMouse + "\n" +
                           "namePC: " + namePC + "\n" + "windowsOS: " + windowsOS + "\n");

        System.out.println("2. Расчет стоимости товара со скидкой");
        
        int itemCost_1 = 100;
        int itemCost_2 = 200;
        int discount = 11;

        int discountSum = (itemCost_1 / 100 * discount) + (itemCost_2 / 100 * discount);
        int totalSum = (itemCost_1 - (itemCost_1 / 100 * discount) + 
                       (itemCost_2 - (itemCost_2 / 100 * discount)));
        System.out.println("Сумма скидки: " + discountSum + "\n" +
                           "Итоговая стоимость товаров со скидкой: " + totalSum);

        System.out.println("\n3. Вывод на консоль слова JAVA");

        char jUpp = 'J';
        char a = 'a';
        char v = 'v';
        char vUpp = 'V';

        System.out.println(
            "   " + jUpp + "    " + a + "  " + v + "    " + v + "  " + a + "\n" + 
            "   " + jUpp + "   " + a + " " + a + "  "+ v + "  " + v + "  " + a + " " + a + "\n" + 
            jUpp +"  " + jUpp + "  " + a + a + a + a + a + "  "+ vUpp + vUpp + "  " + a + a + a + a + a + "\n" + 
            " " + jUpp + jUpp + "  " + a + "     " + a + "  "+ vUpp + " " + a + "     " + a + "\n");

        System.out.println("\n4. Отображение min и max значений числовых типов данных");

        byte b = 127;        
        short s = 32_767;
        int i = 2_147_483_647;
        long l = 9_223_372_036_854_775_807L;

        byte bInc = ++b;
        byte bDec = --b;
        short sInc = ++s;
        short sDec = --s;
        int iInc = ++i;
        int iDec = --i;
        long lInt = ++l;
        long lDec = --l; 
            
        System.out.println(b + " " + bInc + " " + bDec);
        System.out.println(s + " " + sInc + " " + sDec);
        System.out.println(i + " " + iInc + " " + iDec);
        System.out.println(l + " " + lInt + " " + lDec);

        System.out.println("\n5. Перестановка значений переменных");

        double numOne = 1.1;
        double numTwo = 2.2;
        double changeNum;
        
        System.out.println("- перестановка с помощью переменной: \n" + 
                           "numOne: " + numOne +", " + "numTwo: " +  numTwo);
        changeNum = numOne;
        numOne = numTwo;
        System.out.println("numOne: " + numOne +", " + "numTwo: " +  changeNum);

        numOne = 1.1;
        numTwo = 2.2;

        System.out.println("- перестановка с помощью арифметических операций: \n" + 
                           "numOne: " + numOne +", " + "numTwo: " +  numTwo);
        numOne = numOne + numTwo;
        numTwo = numOne - numTwo;
        numOne = numOne - numTwo;
        System.out.println("numOne: " + numOne +", " + "numTwo: " +  numTwo + "\n");

        numOne = 1.1;
        numTwo = 2.2;
        
        System.out.println("- перестановка с помощью побитовых операций: \n"); 
        
        System.out.println("6. Вывод символов и их кодов");
        int aa = 35;
        int bb = 38;
        int cc = 64;
        int dd = 94;
        int ee = 95;

        System.out.println("Код символа: " + aa + ", Символ: " + (char)aa);
        System.out.println("Код символа: " + bb + ", Символ: " + (char)bb);
        System.out.println("Код символа: " + cc + ", Символ: " + (char)cc);
        System.out.println("Код символа: " + dd + ", Символ: " + (char)dd);
        System.out.println("Код символа: " + ee + ", Символ: " + (char)ee + "\n");

        System.out.println("7. Произведение и сумма цифр числа");    
        int num = 345;
        int num_1 = num / 100;
        int num_2 = num % 100 / 10; 
        int num_3 = num % 10;

        System.out.println(num_1 + " " + num_2 + " "+ num_3);
        System.out.println("Сумма чисел: " + (num_1 + num_2 + num_3));
        System.out.println("Сумма чисел: " + num_1 * num_2 * num_3 + "\n");

        System.out.println("8. Вывод на консоль ASCII-арт Дюка");

        int rightSlash = 47;
        int leftSlash = 92;
        int openBracket = 40;
        int closeBracket = 41;
        int underscore = 95;
        int space = 00;

        System.out.println("    " + (char)rightSlash + (char)leftSlash + "\n" +
                           "   " + (char)rightSlash + "  " + (char)leftSlash + "\n" +
                           "  " + (char)rightSlash + (char)underscore + (char)openBracket +
                           (char)space + (char)closeBracket + (char)leftSlash + "\n" + 
                           " " + (char)rightSlash + "      " + (char)leftSlash + "\n" +
                           (char)rightSlash + (char)underscore + (char)underscore + (char)underscore + 
                           (char)underscore + (char)rightSlash + (char)leftSlash + (char)underscore + 
                           (char)underscore + (char)leftSlash + "\n");

        System.out.println("9. Отображение количества сотен, десятков и единиц числа");
        
        int number = 123;

        System.out.println("Число " + num + " содержит:" + "\n" +
                            num / 100 + " сотен" + "\n" + num % 100 / 10 + " десятков" +
                            "\n" + num % 10 + " единиц" + "\n");

        System.out.println("10. Преобразование секунд");

        int seconds = 86399;

        System.out.println(seconds / 3600 + ":" + seconds / 60 % 60 + ":" + seconds % 60 % 60);
    }
}