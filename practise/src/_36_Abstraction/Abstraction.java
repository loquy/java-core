package _36_Abstraction;

public class Abstraction {
    public static void main(String[] args) {

        // abstract = abstract classes cannot be instantiated, but they can have a subclass
        // abstract methods are declared without an implementation

        // Vehicle_36 vehicle = new Vehicle_36();
        Car car = new Car();

        car.go();
    }
}
