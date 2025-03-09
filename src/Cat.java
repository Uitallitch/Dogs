public class Cat extends Animal  {
    private String color;
    public Cat(String name, boolean veg, String food, String color) {
        super(name,veg, food);
        this.color = color;
    }
    public void meow(){
        System.out.println(name + " мяучит");
    }

    public String getColor() {
        return color;
    }
}
