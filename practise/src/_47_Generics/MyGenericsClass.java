package _47_Generics;

public class MyGenericsClass <Thing, Thing2 extends Number> {
    Thing x;
    Thing2 y;

    MyGenericsClass(Thing x , Thing2 y) {
        this.x = x;
        this.y = y;
    }

    public Thing getThingValue(){
        return x;
    }

    public Thing2 getThing2Value(){
        return y;
    }
}
