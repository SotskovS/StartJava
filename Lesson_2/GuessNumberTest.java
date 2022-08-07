import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {

        String playerName1;
        String playerName2;
        String userAnswer;

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scan.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scan.nextLine());

    
        do {
            GuessNumber game = new GuessNumber();
            game.setCompNum();
            game.setPlayerName1(player1.getName());
            game.setPlayerName2(player2.getName());
            game.game();

            boolean flag = false;
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                userAnswer = scan.next();

                if (userAnswer.equals("yes") || userAnswer.equals("no")) {                    
                    flag = false;
                } else {
                    flag = true;
                }
            } while (flag);
        } while(!userAnswer.equals("no"));
    }
}