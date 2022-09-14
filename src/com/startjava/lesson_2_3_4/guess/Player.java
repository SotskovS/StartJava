package com.startjava.lesson_2_3_4.guess;

public class Player {
    private String name;
    private int[] playerNumbers = new int[3];
    private int playerNum;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPlayerNum(int num) {
        int f = 0;

        for (int i = 0; i < playerNumbers.length; i++) {

            this.playerNumbers[i] = num;
        }
    }

    public int[] getArr () {

        return playerNumbers;
    }
}