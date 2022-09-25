package com.startjava.lesson_2_3_4.guess;

import java.util.ArrayList;
import java.util.Arrays;

public class Player {
    private String name;
    private ArrayList playerData = new ArrayList();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setNumber(int number) {
        playerData.add(number);
    }
    
    public ArrayList getArray() {
        return playerData;
    }

}