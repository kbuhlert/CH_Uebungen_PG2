package HousePlan;

public class Door extends RoomOpening {
    private Room room1;
    private Room room2;

    public Door(double posX, double posY, double width, double height, Room room1, Room room2) {
        super(posX, posY, width, height);
        this.room1 = room1;
        this.room2 = room2;
    }
}
