package HousePlan;

public class HousPlanApp {
    public static void main(String[] args) {
        Room elternschlafz = new Room(RoomType.Bedroom, 18.7);
        Room kinderschlafz = new Room(RoomType.Bedroom, 15.5);
        Room kinder2schlafz = new Room(RoomType.Bedroom, 15.8);
        Room hauptkueche = new Room(RoomType.EatInKitchen, 27.2);
        Room flur = new Room(RoomType.Corridor, 13.2);
        Room elternbad = new Room(RoomType.Bathroom, 8.4);

        elternschlafz.addOpening(Orientation.West, new Window(2.2,1.4,1.8,2.0, true));
        elternschlafz.addOpening(Orientation.West, new Window(5.2,1.4,1.8,2.0, true));
        elternschlafz.addOpening(Orientation.North, new Window(2.2,1.4,1.8,2.0, true));
        elternschlafz.addOpening(Orientation.West, new Door(2.2,0.0, 1.1,2.1,elternschlafz, kinderschlafz));
        elternschlafz.addOpening(Orientation.North, new Door(4.2,0.0, 1.1,2.1,elternschlafz, flur));
        elternschlafz.addOpening(Orientation.South, new Door(3.2,0.0, 1.1,2.1,elternbad, elternschlafz));
        kinder2schlafz.addOpening(Orientation.West, new Window(2.2,1.4,1.8,2.0, true));
        kinder2schlafz.addOpening(Orientation.West, new Window(6.8,1.4,1.8,2.0, true));

        hauptkueche.addOpening(Orientation.South, new Window(2.2,1.4,1.8,2.0, true));

        House grueneGasse9 = new House();

        grueneGasse9.addRoom(elternschlafz);
        grueneGasse9.addRoom(kinder2schlafz);
        grueneGasse9.addRoom(kinderschlafz);
        grueneGasse9.addRoom(hauptkueche);
        grueneGasse9.addRoom(flur);
        grueneGasse9.addRoom(elternbad);

        Orientation or = Orientation.West;
        RoomType rt = RoomType.Bedroom;

        System.out.println("Fensterfläche der Fenster in Richtung " + or + " : " + grueneGasse9.getWindowAreaFacingOrientation(or));
        System.out.println("Anzahl der Öffnungen des Typs " + rt + " : " + grueneGasse9.getNumberOfOpeningsinRoomType(rt));
        System.out.println("Zimmer verbunden mit " + elternschlafz + " : " + grueneGasse9.getAllConnectedRooms(elternschlafz));
    }
}
