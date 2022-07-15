public class VariablesTheme {
    
    public static void main(String[] args) {

        System.out.println("\n1. Создание переменных и вывод их значений на консоль");
        byte bitness = 64;
        short countMonitor = 2;
        int codeProduct = 00326; 
        long buildOS = 190441706L;
        float wightPC = 10.2f;
        double weightMouse = 0.127;        
        char namePC = 'a';
        boolean windowsOS = true;

        System.out.println("bitness: " + bitness + "\n" + "cointMonitor: " + countMonitor + "\n" +
                "codeProduct: " + codeProduct + "\n" + "buildOS: " + buildOS + "\n" +
                "wightPC: " + wightPC + "\n" + "weightMouse: " + weightMouse + "\n" +
                "namePC: " + namePC + "\n" + "windowsOS: " + windowsOS + "\n");

        System.out.println("2. Расчет стоимости товара со скидкой");
        
        int priceGoodsX = 100;
        int priceGoodsY = 200;
        int discount = 11;
        
        int discountSum = (priceGoodsX + priceGoodsY) / 100 * discount;
        int totalSum = (priceGoodsX - (priceGoodsX / 100 * discount) + 
                       (priceGoodsX - (priceGoodsY / 100 * discount)));
        System.out.println("Сумма скидки: " + discountSum + "\n" +
                "Итоговая стоимость товаров со скидкой: " + totalSum);

        System.out.println("\n3. Вывод на консоль слова JAVA");

        char jUpp = 'J';
        char a = 'a';
        char v = 'v';
        char vUpp = 'V';

        System.out.println(
                "   " + jUpp + "    " + a + "  " + v + "    " + v + "  " + a + "\n" + 
                "   " + jUpp + "   " + a + " " + a + "  "+ v + "  " + v + "  " + a + " " + a +
                "\n" + jUpp +"  " + jUpp + "  " + a + a + a + a + a + "  "+ vUpp + vUpp + "  " +
                a + a + a + a + a + "\n" + " " + jUpp + jUpp + "  " + a + "     " + a + "  " +
                vUpp + " " + a + "     " + a + "\n");

        System.out.println("\n4. Отображение min и max значений числовых типов данных");

        byte b = 127;        
        short s = 32_767;
        int i = 2_147_483_647;
        long l = 9_223_372_036_854_775_807L;

        System.out.println(b + " " + ++b + " " + --b);
        System.out.println(s + " " + ++s + " " + --s);
        System.out.println(i + " " + ++i + " " + --i);
        System.out.println(l + " " + ++l + " " + --l);
            
        System.out.println("\n5. Перестановка значений переменных");

        double num1 = 1.1;
        double num2 = 2.2;
        double tmp;
        
        System.out.println("- перестановка с помощью переменной: \n" + 
                "num1: " + num1 +", " + "num2: " +  num2);
        tmp = num1;
        num1 = num2;
        num2 = tmp;
        System.out.println("num1: " + num1 +", " + "num2: " +  num2);

        System.out.println("- перестановка с помощью арифметических операций: \n" + 
                "num1: " + num1 +", " + "num2: " +  num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("num1: " + num1 +", " + "num2: " +  num2 + "\n");

        System.out.println("- перестановка с помощью побитовых операций: \n"); 

        String binaryNum1 = Long.toBinaryString(Double.doubleToRawLongBits(num1));
        String binaryNum2 = Long.toBinaryString(Double.doubleToRawLongBits(num2));
        
        System.out.println(binaryNum1);
        System.out.println(binaryNum2);

        System.out.println("\n6. Вывод символов и их кодов");
        
        char code1 = 35;
        char code2 = 38;
        char code3 = 64;
        char code4 = 94;
        char code5 = 95;

        System.out.println("Код символа: " + (int)code1 + ", Символ: " + code1);
        System.out.println("Код символа: " + (int)code2 + ", Символ: " + code2);
        System.out.println("Код символа: " + (int)code3 + ", Символ: " + code3);
        System.out.println("Код символа: " + (int)code4 + ", Символ: " + code4);
        System.out.println("Код символа: " + (int)code5 + ", Символ: " + code5);

        System.out.println("7. Произведение и сумма цифр числа");    
        int srcNum = 345;
        int digit1 = srcNum / 100;
        int digit2 = srcNum % 100 / 10; 
        int digit3 = srcNum  % 10;

        System.out.println(digit1 + " " + digit2 + " "+ digit3);
        System.out.println("Сумма цифр числа " + srcNum  + ": "+ (digit1 + digit2 + digit3));
        System.out.println("Произведение цифр числа " + srcNum + ": " + digit1 * digit2 * digit3 + "\n");

        System.out.println("8. Вывод на консоль ASCII-арт Дюка");

        char slash = 47;
        char backslash = 92;
        char openBracket = 40;
        char closeBracket = 41;
        char underscore = 95;
        char space = 32;

        System.out.println("" + space + space + space + space + slash + backslash + "\n" + space +
                space + space + slash + space + space + backslash + "\n" + space + space + slash +
                underscore + openBracket + space + closeBracket + backslash + "\n" + space +
                slash + space + space + space + space + space + space + backslash + "\n" + slash +
                underscore + underscore + underscore + underscore + slash + backslash +
                underscore + underscore + backslash + "\n");

        System.out.println("9. Отображение количества сотен, десятков и единиц числа");
        
        srcNum = 123;
        
        System.out.println("Число " + srcNum + " содержит:" + "\n" +
                            srcNum / 100 + " сотен" + "\n" + srcNum % 100 / 10 + " десятков" +
                            "\n" + srcNum % 10 + " единиц" + "\n");

        System.out.println("10. Преобразование секунд");

        int totalSeconds  = 86399;
        System.out.println(totalSeconds  / 3600 + ":" + totalSeconds  / 60 % 60 + ":" + totalSeconds  % 60 % 60);
    }
}