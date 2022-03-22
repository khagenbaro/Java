package MarsMission;

public class Rocket implements SpaceShip{
    @Override
    public boolean land() {
        return false;
    }

    @Override
    public boolean canCarry(Items items) {
        return false;
    }

    @Override
    public int carry(Items items) {
        return 0;
    }

    @Override
    public boolean launch() {
        return false;
    }
}
