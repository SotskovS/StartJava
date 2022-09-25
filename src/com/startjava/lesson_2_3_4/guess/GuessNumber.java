package com.startjava.lesson_2_3_4.guess;

import java.util.ArrayList;
import java.util.Arrays;
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

        generateSecretNum();
        do {
            System.out.print(player1.getName() + " введите число от 1 до 100: ");   
            playerNum = scan.nextInt();
            player1.setNumber(playerNum);

            if (player1.getArray().size() == 5) {
                System.out.println("У " + player1.getName() + " попытки закончились!");
            }

            if (checkNumber(player1)) {
                break;
            }
            System.out.print(player2.getName() + " введите число от 1 до 100: ");
            playerNum = scan.nextInt();
            player2.setNumber(playerNum);

            if (player2.getArray().size() == 5) {
                System.out.println("У " + player2.getName() + " попытки закончились!");
                break;
            }
        } while (!checkNumber(player2));
    }

    private void generateSecretNum() {
        Random random = new Random();
        targetNum = random.nextInt(1, 101);
    }

    private boolean checkNumber(Player player) {
        if (playerNum == targetNum) {
            System.out.println("Игрок " + player.getName() + " угадал число " + targetNum +
                    " c " + player.getArray().size() + " попытки ");
            return true;    
        } 
        if (playerNum < targetNum) {
             System.out.println(playerNum + " меньше того, что загадал компьютер");             
        } else if (playerNum > targetNum) {
             System.out.println(playerNum + " больше того, что загадал компьютер");             
        }
        return false;      
    }
}