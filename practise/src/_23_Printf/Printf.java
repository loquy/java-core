package _23_Printf;

public class Printf {
    public static void main(String[] args) {
        System.out.printf("This is a format string %d", 123);
        System.out.println();
        System.out.printf("%d This is a format string", 123);

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        System.out.println();
        System.out.printf("%b", myBoolean);
        System.out.println();
        System.out.printf("%c", myChar);
        System.out.println();
        System.out.printf("%d", myInt);
        System.out.println();
        System.out.printf("%f", myDouble);


        System.out.println();
        System.out.printf("Hello %s", myString);
        System.out.println();
        System.out.printf("Hello %10s", myString);
        System.out.println();
        System.out.printf("Hello %-10s", myString);
        System.out.println();
        System.out.printf("You have this much money %.2f", myDouble);
        System.out.println();
        System.out.printf("You have this much money %-20f", myDouble);
        System.out.println();
        System.out.printf("You have this much money %+f", myDouble);
        System.out.println();
        System.out.printf("You have this much money %020f", myDouble);
        System.out.println();
        System.out.printf("You have this much money %,f", myDouble);
    }
}
