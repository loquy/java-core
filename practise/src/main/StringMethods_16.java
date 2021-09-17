package main;

import java.util.Locale;

public class StringMethods_16 {
    public static void main(String[] args) {
        String name = "Bro";

        boolean result = name.equals("Bro");
        boolean result_1 = name.equals("bro");
        boolean result_2 = name.equalsIgnoreCase("bro");
        int result_3 = name.length();
        char result_4 = name.charAt(0);
        int result_5 = name.indexOf("o");
        boolean result_6 = name.isEmpty();
        String result_7 = name.toUpperCase();
        String result_8 = name.toLowerCase();
        String result_9 = name.trim();
        String result_10 = name.replace('o', 'a');

        System.out.println(result);
        System.out.println(result_1);
        System.out.println(result_2);
        System.out.println(result_3);
        System.out.println(result_4);
        System.out.println(result_5);
        System.out.println(result_6);
        System.out.println(result_7);
        System.out.println(result_8);
        System.out.println(result_9);
        System.out.println(result_10);
    }
}
