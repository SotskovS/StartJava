package com.startjava.lesson_2_3_4.person;

public class Person {
    
    String gender = "male";
    String name = "Mark";
    int height = 175;
    float weight = 77.2f;
    int age = 37;

    public void move() {
        System.out.println("Человек идет");
    }

    public void sit() {
        System.out.println("Человек сидит");
    }

    public void run() {
        System.out.println("Человек бежит");
    }

    public void say() {
        System.out.println("Человек говорит");
    }

    public void learn() {
        System.out.println("Человек учит Java");    
    }
}