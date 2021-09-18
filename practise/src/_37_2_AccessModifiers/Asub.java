package _37_2_AccessModifiers;

import _37_1_AccessModifiers.A;

public class Asub extends A {
    public static void main(String[] args) {
        Asub asub = new Asub();

        System.out.println(asub.protectedMessage);
    }
}
