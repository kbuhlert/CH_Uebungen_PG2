package HousePlan;

public class HousPlanApp {
    public static void main(String[] args) {
        Room elternschlafz = new Room(RoomType.Bedroom, 18.7);
        Room kinderschlafz = new Room(RoomType.Bedroom, 15.5);
        Room kinder2schlafz = new Room(RoomType.Bedroom, 15.8);
        Room hauptkueche = new Room(RoomType.EatInKitchen, 27.2);

        elternschlafz.addOpening(Orientation.West, new Window(2.2,1.4,1.8,2.0, true));
        elternschlafz.addOpening(Orientation.West, new Window(5.2,1.4,1.8,2.0, true));
        elternschlafz.addOpening(Orientation.North, new Window(2.2,1.4,1.8,2.0, true));

        kinder2schlafz.addOpening(Orientation.West, new Window(2.2,1.4,1.8,2.0, true));
        kinder2schlafz.addOpening(Orientation.West, new Window(6.8,1.4,1.8,2.0, true));


        House grueneGasse9 = new House();

        grueneGasse9.addRoom(elternschlafz);
        grueneGasse9.addRoom(kinder2schlafz);
        grueneGasse9.addRoom(kinderschlafz);
        grueneGasse9.addRoom(hauptkueche);

        System.out.println(grueneGasse9.getWindowAreaFacingOrientation(Orientation.West));
    }
}
