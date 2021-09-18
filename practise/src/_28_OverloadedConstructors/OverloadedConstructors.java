package _28_OverloadedConstructors;

public class OverloadedConstructors {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("thicc crust", "tomato", "mozzerella");
        Pizza pizza2 = new Pizza("thicc crust", "tomato", "mozzerella", "pepperoni");

        System.out.println("Here are thi ingredients of your pizza: ");
        System.out.println(pizza1.bread);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.cheese);
        System.out.println(pizza1.topping);
        System.out.println();
        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.cheese);
        System.out.println(pizza2.topping);
    }
}
