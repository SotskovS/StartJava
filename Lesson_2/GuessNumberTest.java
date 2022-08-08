import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String playerAnswer;

        Scanner scan = new Scanner(System.in);        

        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scan.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scan.nextLine());

        do {
            GuessNumber game = new GuessNumber();           
            game.launch();

            System.out.print("Хотите продолжить игру? [yes/no]: ");
            playerAnswer = scan.next();

            if (playerAnswer.equals("yes")) {
                game.launch();                
            }

            boolean flag = false;
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                playerAnswer = scan.next();

                if (playerAnswer.equals("yes") || playerAnswer.equals("no")) {                    
                    flag = false;
                } else {
                    flag = true;
                }
            } while (flag);
        } while(!playerAnswer.equals("no"));
    }
}