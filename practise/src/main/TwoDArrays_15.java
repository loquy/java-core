package main;

public class TwoDArrays_15 {
    public static void main(String[] args) {
        String[][] cars = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "Mustang";
        cars[1][1] = "ranger";
        cars[1][2] = "F-150";
        cars[2][0] = "Ferrari";
        cars[2][1] = "Lambo";
        cars[2][2] = "tasla";

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }

        String[][] newCars = {
            {"Camaro", "Corvette", "Silverado"},
            {"Mustang", "ranger", "F-150"},
            {"Ferrari", "Lambo", "tasla"},
        };

        for (int i = 0; i < newCars.length; i++) {
            System.out.println();
            for (int j = 0; j < newCars[i].length; j++) {
                System.out.print(newCars[i][j] + " ");
            }
        }
    }
}
