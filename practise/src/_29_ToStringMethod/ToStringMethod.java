package _29_ToStringMethod;

public class ToStringMethod {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.year);

        System.out.println();
        System.out.println(car.toString());
        System.out.println();
        System.out.println(car);
    }
}
