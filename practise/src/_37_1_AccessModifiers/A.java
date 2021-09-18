package _37_1_AccessModifiers;

import _37_1_AccessModifiers.B;
import _37_2_AccessModifiers.C;

public class A {

    protected String protectedMessage = "This is protected";

    public static void main(String[] args) {
        C c = new C();
        // System.out.println(c.defaultMessage);
        System.out.println(c.publicMessage);
        // System.out.println(c.protectedMessage);

//        B b = new B();
//        System.out.println(b.privateMessage);
    }
}
