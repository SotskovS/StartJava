import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int targetNum;
    private int playerNum;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    
    private void generateSecretNum() {
        Random random = new Random();
        targetNum = random.nextInt(1, 2);
    }

    public void numberCheck(int playerNum) {
        if (playerNum < targetNum) {
             System.out.println(playerNum + " меньше того, что загадал компьютер");
        } else if (playerNum > targetNum) {
             System.out.println(playerNum + " больше того, что загадал компьютер");                
        } else {
             System.out.println( "Вы победили!");
        } 
    }

    public void launch() {
        Scanner scan = new Scanner(System.in);

        generateSecretNum();
        do {
            System.out.print(player1.getName() + " введите число от 1 до 100: ");   
            playerNum = scan.nextInt();
            numberCheck(playerNum);

            if (playerNum != targetNum) {
                System.out.print(player2.getName() + " введите число от 1 до 100: ");    
                playerNum = scan.nextInt();
                numberCheck(playerNum);                
            }            
        } while (playerNum != targetNum);
    }
}
