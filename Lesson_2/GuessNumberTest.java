import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String playerAnswer;

        Scanner scan = new Scanner(System.in);        

        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scan.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scan.nextLine());

        GuessNumber game = new GuessNumber();           
        game.launch(player1.getName(), player2.getName());
        
        do {
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            playerAnswer = scan.next();

            if (playerAnswer.equals("yes")) {
                game.launch(player1.getName(), player2.getName());
            }
        } while(!playerAnswer.equals("no"));
    }
}