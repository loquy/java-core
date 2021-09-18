package _47_Generics;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        MyIntegerClass myInt = new MyIntegerClass(2);
        MyDoubleClass myDouble = new MyDoubleClass(3.24);
        MyCharacterClass myCharacter = new MyCharacterClass('@');
        MyStringClass myStringClass = new MyStringClass("hello");

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myCharacter.getValue());
        System.out.println(myStringClass.getValue());

        MyGenericsClass<Integer, Integer> myInt2 = new MyGenericsClass<>(2, 9);
        MyGenericsClass<Double, Double> myDouble2 = new MyGenericsClass<>(3.24, 2.07);
        MyGenericsClass<Character, Integer> myCharacter2 = new MyGenericsClass<>('@', 132);
        MyGenericsClass<String, Integer> myStringClass2 = new MyGenericsClass<>("hello", 321);

//        ArrayList<String> myFriends = new ArrayList<>();
//        HashMap<Integer, String> users = new HashMap<>();

        System.out.println(myInt2.getThingValue());
        System.out.println(myDouble2.getThingValue());
        System.out.println(myCharacter2.getThingValue());
        System.out.println(myStringClass2.getThingValue());        
        
        System.out.println(myInt2.getThing2Value());
        System.out.println(myDouble2.getThing2Value());
        System.out.println(myCharacter2.getThing2Value());
        System.out.println(myStringClass2.getThing2Value());
    }
}
