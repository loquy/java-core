package _40_Interface;

public class Fish implements Pray, Predator{

    @Override
    public void flee() {
        System.out.println("*This fish is hunting smaller fish*");
    }

    @Override
    public void hunt() {
        System.out.println("*This fish is fleeing from a larger fish*");
    }
}
