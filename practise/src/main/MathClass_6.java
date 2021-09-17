package main;

import java.util.Scanner;

public class MathClass_6 {
    public static void main(String[] args) {
        double x = 3.14;
        double y = -10;

        double max = Math.max(x, y);
        System.out.println(max);

        double abs = Math.abs(y);
        System.out.println(abs);

        double round = Math.round(x);
        System.out.println(round);

        double ceil = Math.ceil(x);
        System.out.println(ceil);

        double floor = Math.floor(x);
        System.out.println(floor);


        double x1;
        double y2;
        double z3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x1: ");
        x1 = scanner.nextDouble();
        System.out.println("Enter side y2: ");
        y2 = scanner.nextDouble();

        z3 = Math.sqrt((x1*x1)+(y2*y2));

        System.out.println("The hypotenuse is :" + z3);

        scanner.close();
    }
}
