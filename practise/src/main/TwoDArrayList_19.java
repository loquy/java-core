package main;

import java.util.ArrayList;

public class TwoDArrayList_19 {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("sode");
        drinksList.add("coffee");


        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList);
        System.out.println(groceryList.get(0).get(0));
        System.out.println(groceryList.get(2).get(1));

        System.out.println(bakeryList);
        System.out.println(produceList);
        System.out.println(drinksList);
    }
}
