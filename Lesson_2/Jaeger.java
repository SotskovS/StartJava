public class Jaeger {
    
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public void setModelName(String modelName) { this.modelName = modelName; }
    public void setMark(String mark) { this.mark = mark; }
    public void setOrigin(String origin) { this.origin = origin; }
    public void setHeight(float height) { this.height = height; }
    public void setWeight(float weight) { this.weight = weight; }
    public void setSpeed(int speed) { this.speed = speed; }
    public void setStrength(int strength) { this.strength = strength; }
    public void setArmor(int armor) { this.armor = armor; }

    public Jaeger(String modelName, String mark, String origin, float height, float weight,
        int speed, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName() { return modelName; }
    public String getMark() { return mark; }
    public String getOrigin() { return origin; }
    public float getHeight() { return height; }
    public float getWeight() { return weight; }
    public int getSpeed() { return speed; }
    public int getStrength() { return strength; }
    public int getArmor() { return armor; }

    boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;        
    }

    void move() {
        System.out.println("Вы прошли 5 шагов");
    }

    String scanKaiju() {
        return "nothing";
    }

}