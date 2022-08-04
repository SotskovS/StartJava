public class JaegerTest {
    public static void main(String[] args) {
        Jaeger robot1 = new Jaeger("", "", "", 0, 0, 0, 0, 0);

        robot1.setModelName("Horison Brave");
        robot1.setMark("Mark-1");
        robot1.setOrigin("China");
        robot1.setHeight(72.64f);
        robot1.setWeight(8.890f);
        robot1.setSpeed(8);
        robot1.setStrength(4);
        robot1.setArmor(6);

        System.out.println("Робот 1");
        System.out.println("Наименование: " + robot1.getModelName());
        System.out.println("Поколение: " + robot1.getMark());
        System.out.println("Страна: " + robot1.getOrigin());
        System.out.println("Высота: " + robot1.getHeight());
        System.out.println("Вес: " + robot1.getWeight());
        System.out.println("Скорость: " + robot1.getSpeed());
        System.out.println("Сила: " + robot1.getStrength());
        System.out.println("Защита: " + robot1.getArmor());
        robot1.move();
        
        Jaeger robot2 = new Jaeger("Tacit Ronin", "Mark-1", "Japan", 74.37f, 7.450f, 8, 7, 3);
        System.out.println("\nРобот 1");
        System.out.println("Наименование: " + robot2.getModelName());
        System.out.println("Поколение: " + robot2.getMark());
        System.out.println("Страна: " + robot2.getOrigin());
        System.out.println("Высота: " + robot2.getHeight());
        System.out.println("Вес: " + robot2.getWeight());
        System.out.println("Скорость: " + robot2.getSpeed());
        System.out.println("Сила: " + robot2.getStrength());
        System.out.println("Защита: " + robot2.getArmor());
        System.out.println("Поиск Kaiju: " + robot2.scanKaiju());
    }
}