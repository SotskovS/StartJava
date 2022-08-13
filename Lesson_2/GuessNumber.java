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

    public void launch() {
        Scanner scan = new Scanner(System.in);
        boolean result;

        generateSecretNum();        
        do {
            System.out.print(player1.getName() + " введите число от 1 до 100: ");   
            playerNum = scan.nextInt();
            result = checkNumber(player1);

            if (result) {
                System.out.print(player2.getName() + " введите число от 1 до 100: ");    
                playerNum = scan.nextInt();
                result = checkNumber(player2);
            }            
        } while (result);
    }

    private void generateSecretNum() {
        Random random = new Random();
        targetNum = random.nextInt(1, 2);
    }

    private boolean checkNumber(Player player) {
        if (playerNum < targetNum) {
             System.out.println(playerNum + " меньше того, что загадал компьютер");
             return true;
        } else if (playerNum > targetNum) {
             System.out.println(playerNum + " больше того, что загадал компьютер");
             return true;
        } else {
             System.out.println(player.getName() + " Вы победили!");
             return false;
        } 
    }
}