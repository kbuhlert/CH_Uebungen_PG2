package HousePlan;

public class HouseDoor extends Door {
    private boolean securityDoor;

    public HouseDoor(double posX, double posY, double width, double height, Room room1, Room room2, boolean securityDoor) {
        super(posX, posY, width, height, room1, room2 = null);
        this.securityDoor = securityDoor;
    }
}
