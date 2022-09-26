package com.startjava.lesson_2_3_4.guess;

public class Player {
    private String name;
    private int[] playerData = new int[10];
    private int i = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setNumber(int number) {
        playerData[i] = number;
        i++;
    }

    public int[] getArray() {
        return playerData;
    }

}