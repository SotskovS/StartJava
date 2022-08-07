import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int compNum;
    private int playerNum;
    private String playerName1;
    private String playerName2; 
    
    public void setCompNum() {
        Random random = new Random();
        compNum = random.nextInt(1, 101);
        this.compNum = compNum;
    }

    public int getCompNum() {
        return compNum;
    }

    public void setPlayerNum(int playerNum) {
        this.playerNum = playerNum;
    }

    public int getPlayerNum() {
        return playerNum;
    }

    public void setPlayerName1(String playerName1) {
        this.playerName1 = playerName1;        
    }

    public void setPlayerName2(String playerName2) {
        this.playerName2 = playerName2;        
    }    

    public void game() {
        int count = 1;

        do {            
            if (count == 1) {
                System.out.print(playerName1 + " введите число от 1 до 100: ");
                count = 2;
            } else {
                System.out.print(playerName2 + " введите число от 1 до 100: ");
                count = 1;
            }       

            Scanner scan = new Scanner(System.in);    
            playerNum = scan.nextInt();

            if (playerNum < compNum) {
                System.out.println(playerNum + " меньше того, что загадал компьютер");                
            } else if (playerNum > compNum) {
                System.out.println(playerNum + " больше того, что загадал компьютер");                
            } 
            if (playerNum == compNum) {
                System.out.println( "Вы победили!");                
                System.out.println(compNum);
            }
        } while (playerNum != compNum);
    }
}
