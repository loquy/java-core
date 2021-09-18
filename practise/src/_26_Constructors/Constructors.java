package _26_Constructors;

public class Constructors {
    public static void main(String[] args) {
        // constructor = special method that is called when an object is instantiated (created)
        Human human1 = new Human("Bro",18,100);
        System.out.println(human1.name);
        System.out.println(human1.age);
        System.out.println(human1.weight);
        Human human2 = new Human("Morty",8,20);
        System.out.println(human2.name);
        System.out.println(human2.age);
        System.out.println(human2.weight);
        human2.eat();
        human1.drink();
    }
}
