public class Animal {
   private boolean vegetarian;
   private String food;
   public String name;
   private static int animalCount;

    public static int getAnimalCount() {
        return animalCount;
    }

    public Animal(String name, boolean veg, String food) {
        this.name = name;
        this.vegetarian = veg;
        this.food = food;
        animalCount++;

    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getFood() {
        return food;
    }

}
