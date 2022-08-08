import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int targetNum;
    private int playerNum;
    private String playerName1;
    private String playerName2; 
    
    public void generateSecretNum() {
        Random random = new Random();
        targetNum = random.nextInt(1, 101);
        this.targetNum = targetNum;
    }

    public int getCompNum() {
        return targetNum;
    }

    public int getPlayerNum() {
        return playerNum;
    }

    public void launch() {
        Scanner scan = new Scanner(System.in);  
        generateSecretNum();

        int count = 1;

        do {            
            if (count == 1) {
                System.out.print(" введите число от 1 до 100: ");
                count = 2;
            } else {
                System.out.print(" введите число от 1 до 100: ");
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
