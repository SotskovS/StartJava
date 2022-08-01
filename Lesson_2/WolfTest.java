public class WolfTest {
    
    public static void main(String[] args) {        
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("самец");
        wolfOne.setName("Ателло");
        wolfOne.setWeight(45.7f);
        wolfOne.setAge(5);
        wolfOne.setColor("grey");
        
        System.out.println("Пол волка: " + wolfOne.getGender());
        System.out.println("Кличка волка: " + wolfOne.getName());
        System.out.println("Вес волка: " + wolfOne.getWeight() + " кг.");
        System.out.println("Возраст волка: " + wolfOne.getAge() + " лет");
        System.out.println("Цвет шерсти волка: " + wolfOne.getColor());
    }
}