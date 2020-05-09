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

    public void addRoom (Room r){
        List<Room> roomList;    //Warum kann ich Liste nicht bereits hier initialisieren, sondern erst in if()...
        RoomType rt = r.getType();
        roomList = rooms.get(rt);
        if(roomList == null) {
            roomList = new ArrayList<Room>();
            roomList.add(r);
            rooms.put(rt,roomList);
        }else{
            roomList.add(r);
            rooms.put(rt,roomList); }
        }

    public double getWindowAreaFacingOrientation (Orientation o){
        double windArea = 0;
        for(RoomType rt:rooms.keySet()){
            List<Room> roomList = new ArrayList<>();
            roomList = rooms.get(rt);
            for(Room r:roomList){
               HashMap<Orientation, List<RoomOpening>>  zwischenMap = r.getOpenings();
               if(zwischenMap.containsKey(o)){
                   List<RoomOpening> zwischenListe = zwischenMap.get(o);
                   for(RoomOpening rop :zwischenListe){
                       if (rop instanceof Window){
                           windArea = windArea + (rop.getHeight() * rop.getWidth());

                       }
                   }
               }
                }
            }
        return windArea;
    }
}
