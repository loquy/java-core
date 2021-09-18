package _41_Polymorphism;

public class polymorphism {

    public static void main(String[] args) {
        // polymorphism = greek work for poly-"many", morph-"form"
        // The ability of an object to identify as more than one type

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehical[] racers = {car, bicycle, boat};

//        car.go();
//        bicycle.go();
//        boat.go();

        for (Vehical x : racers) {
            x.go();
        }
    }
}
