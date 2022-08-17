package com.startjava.lesson_2_3.animal;

public class WolfTest {
    
    public static void main(String[] args) {        
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("самец");
        wolfOne.setName("Ателло");
        wolfOne.setWeight(45.7f);
        wolfOne.setAge(5);
        wolfOne.setColor("серый");
        
        System.out.println("Пол волка: " + wolfOne.getGender());
        System.out.println("Кличка волка: " + wolfOne.getName());
        System.out.println("Вес волка: " + wolfOne.getWeight() + " кг.");
        if (wolfOne.getAge() == 0) {
            System.out.println("Возраст волка: " + "Некорректный возраст");
        } else {
            System.out.println("Возраст волка: " + wolfOne.getAge() + " лет");
        }
        System.out.println("Цвет шерсти волка: " + wolfOne.getColor());
    }
}