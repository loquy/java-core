package _11_WhileLoop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank()) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("hello: " + name);

//        while (1==1) {
//            System.out.println("Help,I'm stuck in a while loop");
//        }
    }
}
