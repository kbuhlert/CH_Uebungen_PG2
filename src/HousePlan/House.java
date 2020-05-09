package HousePlan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class House {
    Map<RoomType, List<Room>> rooms;

    public House() {
        rooms = new HashMap<RoomType, List<Room>>();
    }

    public void addRoom (Room r, RoomType rt){
        List<Room> roomList = new ArrayList<Room>();
        roomList = rooms.get(rt);
        if(roomList == null) {
            rooms.put(rt,roomList);
        }else{
            roomList.add(r);
            rooms.put(rt,roomList); }
        }

    public double getWindowAreaFacingOrientation (Orientation o){
        

        return 0;
    }
}
