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
            rooms.put(rt,roomList); }//in seiner Lösung hat CH das put nicht. Warum ist das nicht notwendig?
        }

    public double getWindowAreaFacingOrientation (Orientation o){
        double windArea = 0;
        for(RoomType rt:rooms.keySet()){
            List<Room> roomList = new ArrayList<>();    //warum kann ich nicht new List initalisieren? (List = Abstract?)
            roomList = rooms.get(rt);   //legt die Werte (Liste mit Räumen), die dem Key RoomType zugeordnet sind in Liste
            for(Room r:roomList){       //geht die Raumliste mit jedem einzelnen Raum durch
               HashMap<Orientation,List<RoomOpening>>  zwischenMap = r.getOpenings(); //Holt HashMap die zu jedem Raum gehört
                //diese Hashmap enthält sämtliche Öffnungen des Raums, auch Fenster und die zugehörige Orientation
               if(zwischenMap.containsKey(o)){  //wenn die Hashmap Werte zum Parameter Orientation enthält, sollen diese ausgelesen werden
                   List<RoomOpening> zwischenListe = zwischenMap.get(o);//legt die Werte (Raumöffnungen) die in die gewählte
                   // Richtung zeigen (Key = o) in neue Liste, die dann alle Raumöffnungen des Raumes (r) der Wunschrichtung enthält
                   for(RoomOpening rop :zwischenListe){ //jetzt werden alle Raumöffnungen (Richtung passt bereits) durchgeschaut
                       if (rop instanceof Window){  //wenn es sich bei der Raumöffnung um ein Fenster handelt, werden Maße des Fensters geholt
                           windArea = windArea + (rop.getHeight() * rop.getWidth()); //Mit den Fenstermaßen wird Fensteroberfläche berechnet und Aufsummiert

                       }
                   }
               }
                }
            }
        return windArea;    //Die Summe aller Fensteroberflächen in sämtlichen Räumen die in Wunschrichtung (o) zeigen werden zurückgegeben
    }

    public int getNumberOfOpeningsinRoomType (RoomType rt){
        int numberOfOpenings = 0;
        List<Room> alleRaumeList = rooms.get(rt);
        for(Room r:alleRaumeList){
            HashMap<Orientation,List<RoomOpening>> raumMitRichtungHM = r.getOpenings();
            for(Orientation or:raumMitRichtungHM.keySet()){
                List<RoomOpening> alleOeffnungenList = raumMitRichtungHM.get(or);
                for (RoomOpening ro:alleOeffnungenList){
                        numberOfOpenings++;
                    }
                }
            }
        return numberOfOpenings;
        }

    public List<Room> getAllConnectedRooms(Room room){
        List<Room> alleVerbundenenRaume = new ArrayList<Room>();
        for(RoomType rt: rooms.keySet()){
            List<Room> alleRaume = rooms.get(rt);
            for(Room r:alleRaume){
                if(r.equals(room)){
                    for(Orientation or:r.getOpenings().keySet()){
                        List<RoomOpening> alleOeffnungenVonRaum = r.getOpenings().get(or);
                        for(RoomOpening ro:alleOeffnungenVonRaum){
                            if(ro instanceof Door){
                                if (((Door) ro).getRoom1().equals(r)){
                                    alleVerbundenenRaume.add(((Door) ro).getRoom2());}
                                else {
                                    alleVerbundenenRaume.add(((Door) ro).getRoom1());
                                }
                            }
                        }
                    }
                }
            }
        }
        return alleVerbundenenRaume;
    }

    
}
