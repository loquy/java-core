package _25_Objects;

public class Objects {
    public static void main(String[] args) {
        // object = an instance of a class that may contain attributes and methods
        // example: (phone, desk, computer, coffee cup)

        Car myCar1 = new Car();
        Car myCar2 = new Car();
        System.out.println(myCar1.make);
        System.out.println(myCar1.model);
        System.out.println(myCar1.year);
        System.out.println(myCar1.color);
        System.out.println(myCar1.price);

        System.out.println();

        System.out.println(myCar2.make);
        System.out.println(myCar2.model);
        System.out.println(myCar2.year);
        System.out.println(myCar2.color);
        System.out.println(myCar2.price);

        System.out.println();

        myCar1.drive();
        myCar1.brake();
    }
}
