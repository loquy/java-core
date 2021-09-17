package main;

import java.util.ArrayList;

public class ArrayList_18 {
    public static void main(String[] args) {
       ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        food.set(0, "shushi");
        food.remove(2);
//        food.clear();

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
