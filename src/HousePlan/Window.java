package HousePlan;

public class Window extends RoomOpening{

   private boolean canBeOpened;

    public Window(double posX, double posY, double width, double height, boolean canBeOpened) {
        super(posX, posY, width, height);
        this.canBeOpened = canBeOpened;
    }
}
