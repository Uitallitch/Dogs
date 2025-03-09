//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog joy = new Dog(4.5, "Той-терьер", "Джой", 13 );
        Dog bigDog = new Dog(35, "Сеттер", "Пупа", 5);
        bigDog.setName("Барбос");
        System.out.println(bigDog.getAge());
        Cat murzik = new Cat("Мурзик", false, " мясо", "Серый");
        System.out.println(murzik.getColor());
        murzik.meow();
        System.out.println(Animal.getAnimalCount());



    }
}