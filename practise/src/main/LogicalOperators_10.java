package main;

import java.util.Scanner;

public class LogicalOperators_10 {
    public static void main(String[] args) {
        int temp = 15;

        if(temp>30) {
            System.out.println("It is hot outside");
        }
        else if(temp >= 20 && temp<= 30) {
            System.out.println("It is warm outside");
        }
        else {
            System.out.println("It is cold outside");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! press q or Q to quit");
        String response = scanner.next();

        if(!response.equals("q") && !response.equals("Q")) {
            System.out.println("You are still playing the game * pew pew*");
        } else {
            System.out.println("You quit the game");
        }
    }
}

