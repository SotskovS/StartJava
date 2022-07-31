public class WolfTest {
    
    public static void main(String[] args) {        
        Wolf wolfOne = new Wolf();
        wolfOne.genderOfWolf = "самец";
        wolfOne.name = "Ателло";
        wolfOne.weight = 45.7f;
        wolfOne.age = 15;
        wolfOne.color = "grey";
        
        System.out.println("Пол волка: " + wolfOne.genderOfWolf);
        System.out.println("Кличка волка: " + wolfOne.name);
        System.out.println("Вес волка: " + wolfOne.weight + " кг.");
        System.out.println("Возраст волка: " + wolfOne.age + " лет");
        System.out.println("Цвет шерсти волка: " + wolfOne.color);
        
        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();        
        wolfOne.hunt();
    }
}