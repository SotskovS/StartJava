import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int targetNum;
    private int playerNum;
    
    private void generateSecretNum() {
        Random random = new Random();
        targetNum = random.nextInt(1, 101);
    }

    public void launch(String player1, String player2) {
        generateSecretNum();
        Scanner scan = new Scanner(System.in);  

        int count = 1;

        do {            
            if (count == 1) {
                System.out.print(player1 + " введите число от 1 до 100: ");
                count = 2;
            } else {
                System.out.print(player2 + " введите число от 1 до 100: ");
                count = 1;
            }       

            playerNum = scan.nextInt();

            if (playerNum < targetNum) {
                System.out.println(playerNum + " меньше того, что загадал компьютер");                
            } else if (playerNum > targetNum) {
                System.out.println(playerNum + " больше того, что загадал компьютер");                
            } 
            if (playerNum == targetNum) {
                System.out.println( "Вы победили!");                
                System.out.println(targetNum);
            }                
        } while (playerNum != targetNum);
    }
}
