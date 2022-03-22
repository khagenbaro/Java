package Interfaces;

public class Caravan implements  Habitable , Movable{
    public Caravan() {
    }


    public static void main(String[] args) {
            Habitable habitable = new Caravan();
            habitable.fit();
            Movable movable = new Caravan();
            movable.move();
    }

    @Override
    public void fit() {
        System.out.println("fit in Caravan");


    }

    @Override
    public void move() {
        System.out.println("Caravan can move");

    }

    @Override
    public void move2() {

    }
}
