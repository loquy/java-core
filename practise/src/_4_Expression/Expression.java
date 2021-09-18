package _4_Expression;

public class Expression {
    public static void main(String[] args) {
        // expression = operands & operators
        // operands = values, variables, numbers, quantity
        // operators = + - * / %

        int friends = 10;

        System.out.println(friends + 1);
        System.out.println(friends - 1);
        System.out.println(friends * 2);
        System.out.println(friends / 3);
        System.out.println((double) friends / 3);
        System.out.println(friends % 3);
        friends--;
        System.out.println(friends);
        friends++;
        System.out.println(friends);
        ++friends;
        System.out.println(friends);
        --friends;
        System.out.println(friends);
    }
}
