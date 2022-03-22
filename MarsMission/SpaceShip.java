package MarsMission;

public interface SpaceShip {
    boolean launch();
    boolean land();
    boolean canCarry( Items items);
    int carry(Items items);

}
