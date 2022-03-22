package Interfaces;

public interface Animal {
    public void eat();

    public void run();
    //this method is common to all its subclasses
    public static void dangerous() {
        System.out.println("Is Dangerous");
    }

    public static void dangerous1() {
        System.out.println("Is Dangerous");
    }


}
