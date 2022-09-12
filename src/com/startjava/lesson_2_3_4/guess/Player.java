package com.startjava.lesson_2_3_4.guess;

public class Player {    
    private String name;
    private int playerNumbers;
    private int playerNum;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPlayerNum(int playerNum) {
        this.playerNum = playerNum;
    }

    Player(int num ) {
        this.playerNumbers = num;
    };

    public int getPlayerNum() {
        return playerNum;
    }
}