/**
 * Created by Артем on 11.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(5, "Murz", "Red");
        Dog dog = new Dog(5, "Bagira");
        cat.about();
        dog.about();
        System.out.println("Teeest");
    }
}
