/**
 * Created by Артем on 11.09.2016.
 */
public class Cat {
    int age;
    String name;
    String color;

    public Cat(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }
    void about(){
        System.out.printf("Возраст: %d,Имя: %s,Цвет: %s\t\t",age,name,color);
    }
}
