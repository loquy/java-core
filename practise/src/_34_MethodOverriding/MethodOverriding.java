package _34_MethodOverriding;

public class MethodOverriding {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Dog dog = new Dog();

        dog.speak();
        animal.speak();
    }
}
