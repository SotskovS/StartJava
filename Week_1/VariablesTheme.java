public class VariablesTheme {
    
    public static void main(String[] args) {
        byte bitness = 64;
        short cointMonitor = 2;
        int codeProduct = 00326; 
        long buildOS = 190441706L;
        float wightPC = 10.2f;
        double weightMouse = 0.127;        
        char namePC = 'a';
        boolean windowsOS = true;

        System.out.print("bitness: " + bitness + "\n" + "cointMonitor: " + cointMonitor + "\n" +
                           "codeProduct: " + codeProduct + "\n" + "buildOS: " + buildOS + "\n" +
                           "wightPC: " + wightPC + "\n" + "weightMouse: " + weightMouse + "\n" +
                           "namePC: " + namePC + "\n" + "windowsOS: " + windowsOS);
        
        System.out.println("\n");

        int itemCost_1 = 100;
        int itemCost_2 = 200;
        int discoumt = 11;

        int discountSum = (itemCost_1 / 100 * discoumt) + (itemCost_2 / 100 * discoumt);
        int totalSum = (itemCost_1 - (itemCost_1 / 100 * discoumt) + 
                       (itemCost_2 - (itemCost_2 / 100 * discoumt)));
        System.out.print("Сумма скидки: " + discountSum + "\n" +
                           "Итоговая стоимость товаров со скидкой: " + totalSum);

        System.out.println("\n");

        char jUpp = 'J';
        char a = 'a';
        char v = 'v';
        char vUpp = 'V';

        System.out.print(
            "   " + jUpp + "   " + a + "  " + v + "    " + v + "  " + a + "\n" + 
            "   " + jUpp + "  " + a + " " + a + "  "+ v + "  " + v + "  " + a + " " + a + "\n" + 
            jUpp +"  " + jUpp + " " + a + a + a + a + a + "  "+ vUpp + vUpp + "  " + a + a + a + a + a + "\n" + 
            " " + jUpp + jUpp + " " + a + "     " + a + "  "+ vUpp + " " + a + "     " + a + "\n");

        System.out.println("\n");

        byte b = 127;
        short s = 32_767;
        int i = 2_147_483_647;
        long l = 9_223_372_036_854_775_807L;

        byte bInc = b++;
        byte bDec = b--;
        short sInc = s++;
        short sDec = s--;
        int iInc = i++;
        int iDec = i--;
        long lInt = l++;
        long lDec = l--; 

            
        System.out.println(b + " " + bInc + " " + bDec);
        System.out.println(s + " " + sInc + " " + sDec);
        System.out.println(i + " " + iInc + " " + iDec);
        System.out.print(l + " " + lInt + " " + lDec);

        System.out.println("\n");

        float numOne = 1.3f;
        float numTwo = 3.2f;
        float changeNum;
        
        System.out.println("Перестановка с помощью переменной: \n" + 
                           "numOne: " + numOne +", " + "numTwo: " +  numTwo);
        changeNum = numOne;
        numOne = numTwo;
        System.out.println("numOne: " + numOne +", " + "numTwo: " +  changeNum);

        numOne = 1.3f;
        numTwo = 3.2f;

        System.out.println("Перестановка с помощью арифметических операций: \n" + 
                           "numOne: " + numOne +", " + "numTwo: " +  numTwo);
        numOne = numOne + numTwo;
        numTwo = numOne - numTwo;
        numOne = numOne - numTwo;
        System.out.print("numOne: " + numOne +", " + "numTwo: " +  numTwo);

        // numOne = 1.3f;
        // numTwo = 3.2f;

        // System.out.println("Перестановка с помощью побитовых операций: \n" + 
        //                    "numOne: " + numOne +", " + "numTwo: " +  numTwo);
        // numOne = numOne ^ numTwo;
        // numTwo = numOne ^ numTwo;
        // numOne = numOne ^ numTwo;
        // System.out.println("numOne: " + numOne +", " + "numTwo: " +  numTwo);

        System.out.println("\n");

        int aa = 35;
        int bb = 38;
        int cc = 64;
        int dd = 94;
        int ee = 95;

        System.out.println("Код символа: " + aa + ", Символ: " + (char)aa);
        System.out.println("Код символа: " + bb + ", Символ: " + (char)bb);
        System.out.println("Код символа: " + cc + ", Символ: " + (char)cc);
        System.out.println("Код символа: " + dd + ", Символ: " + (char)dd);
        System.out.print("Код символа: " + ee + ", Символ: " + (char)ee);

        System.out.println("\n");

        int num = 345;
        int num_1 = num / 100;
        int num_2 = num % 100 / 10; 
        int num_3 = num % 10;

        System.out.println(num_1 + " " + num_2 + " "+ num_3);
        System.out.println("Сумма чисел: " + (num_1 + num_2 + num_3));
        System.out.println("Сумма чисел: " + num_1 * num_2 * num_3);

        System.out.println("\n");

        char rightSlash = '/';


    }
}