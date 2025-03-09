public class Dog {
    private double weight;
    private String breed;
    private String name;
    private int age;
    private static int dogCount;


    public Dog(double weight, String breed, String name, int age) {
        this.weight = weight;
        this.breed = breed;
        this.name = name;
        this.age = age;
        dogCount++;

    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }

    void woof() {
        System.out.println("Гав!");
    }

    void sit() {
        System.out.println(name + " садится.");
    }

    void bringStick() {
        System.out.println(name + " несёт палку.");
    }

    void eat() {
        this.weight += 0.5;
        System.out.println(name + " поел и теперь весит " + weight);
    }

    void pee() {
        this.weight -= 0.2;
        System.out.println(name + " пописал и теперь весит " + weight);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




}
