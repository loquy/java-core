package _14_Array;

public class Array {
    public static void main(String[] args) {
        // array = used to store multiple values in a single variable

        String[] cars = {"Camaro", "Corvette", "Tesla"};

        cars[0] = "Mustang";

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        String[] newCars = new String[3];

        newCars[0] = "Camaro";
        newCars[1] = "Corvette";
        newCars[2] = "Tesla";
        System.out.println(newCars[0]);
        System.out.println(newCars[1]);
        System.out.println(newCars[2]);

        for(int i=0; i< cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
