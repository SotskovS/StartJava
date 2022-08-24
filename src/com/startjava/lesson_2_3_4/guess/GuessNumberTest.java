package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scan.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scan.nextLine());

        GuessNumber game = new GuessNumber(player1, player2);           
        
        String playerAnswer = "yes";
        while(!playerAnswer.equals("no")) {
            if (playerAnswer.equals("yes")) {
                game.launch();                
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            playerAnswer = scan.next();
        }
    }
}