package Interfaces;

public class Tiger implements  Animal{
    @Override
    public void eat() {
        System.out.println("Tiger eat meat");
    }

    @Override
    public void run() {
        System.out.println("Tiger runs fast");

    }

    public static void main(String[] args) {
        Animal obj1 = new Tiger();
        Animal obj2 = new Tiger();
        obj1.eat();
        obj1.run();
       // obj1.dangerous();

    }
}
