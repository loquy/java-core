package main;

public class Method_21 {
    public static void main(String[] args) {
        String name = "Bro";
        int age = 21;
        hello(name, age);

        int x = 3;
        int y = 4;
        int z = add(x, y);
        System.out.println(z);
    }

    static void hello(String name, int age) {
        System.out.println("hello " + name);
        System.out.println("You are " + age);
    }

    static int add(int x, int y) {
        return x + y;
    }
}
