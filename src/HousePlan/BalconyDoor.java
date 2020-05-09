package HousePlan;

public class BalconyDoor extends Door{
    private boolean tiltable;

    public BalconyDoor(double posX, double posY, double width, double height, Room room1, Room room2, boolean tiltable) {
        super(posX, posY, width, height, room1, room2=null);
        this.tiltable = tiltable;
    }
}
