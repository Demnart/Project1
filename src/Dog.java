/**
 * Created by Артем on 11.09.2016.
 */
public class Dog {
    int age;
    String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }
    void about(){
        System.out.printf("Имя %d,Возраст %s",age,name);
    }
}
