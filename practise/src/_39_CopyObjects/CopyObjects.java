package _39_CopyObjects;

import _38_Encapsulation.Car;

public class CopyObjects {

    public static void main(String[] args) {
        Car car1 = new Car("Chevrolet", "Camaro", 2021);
//        Car car2 = new Car("Ford", "Mustang", 2022);
        Car car2 = new Car(car1);

//        car2 = car1;
//        car2.copy(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }

}