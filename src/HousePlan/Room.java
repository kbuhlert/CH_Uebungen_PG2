package HousePlan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Room {

    private RoomType type;
    private double area;
    private HashMap<Orientation, List<RoomOpening>> openings;

    public Room(RoomType type, double area) {
        this.type = type;
        this.area = area;
        openings = new HashMap<Orientation, List<RoomOpening>>();
    }

   public void addOpening(Orientation orientation, RoomOpening ro){
        List<RoomOpening> roomOpeningList = new ArrayList<RoomOpening>();
        if (openings.containsKey(orientation)){
            roomOpeningList = openings.get(orientation);
            roomOpeningList.add(ro);
            openings.put(orientation,roomOpeningList);
        }else {
            roomOpeningList.add(ro);
            openings.put(orientation,roomOpeningList);
        }
    }

    public RoomType getType() {
        return type;
    }

    public double getArea() {
        return area;
    }

    public HashMap<Orientation, List<RoomOpening>> getOpenings() {
        return openings;
    }
}
