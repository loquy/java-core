package _18_ArrayList;

import java.util.ArrayList;

public class _ArrayList {
    public static void main(String[] args) {
       java.util.ArrayList<String> food = new java.util.ArrayList<String>();

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
