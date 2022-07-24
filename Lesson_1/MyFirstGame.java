public class MyFirstGame {
    public static void main(String[] args) {
        int numComp = 45;
        int numUser = 100;

        do {
            if (numUser < numComp) {
                System.out.println(numUser + " меньше того, что загадал компьютер");
                numUser++;
            } else if (numUser > numComp) {
                System.out.println(numUser + " больше того, что загадал компьютер");
                numUser--;
            } 
            if (numUser == numComp) {
                System.out.println( "Вы победили!");
            }
        } while (numUser != numComp);
    }
}