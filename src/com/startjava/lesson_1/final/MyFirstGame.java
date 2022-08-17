public class MyFirstGame {
    public static void main(String[] args) {
        int compNum = 45;
        int playerNum = 100;

        do {
            if (playerNum < compNum) {
                System.out.println(playerNum + " меньше того, что загадал компьютер");
                playerNum++;
            } else if (playerNum > compNum) {
                System.out.println(playerNum + " больше того, что загадал компьютер");
                playerNum--;
            } 
            if (playerNum == compNum) {
                System.out.println( "Вы победили!");
            }
        } while (playerNum != compNum);
    }
}