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
        List<Room> alleRaumeList = rooms.get(rt);//Die Liste mit Räumen des eingegebenen Raumtyp wird aus der HashMap (rooms) geholt und als "alleRaumeListe" gespeichert
        for(Room r:alleRaumeList){  //Jeder Raum aus der Liste wird einzeln durchlaufen, so dass für jeden Raum auf dessen HashMap zugegriffen werden kann
            HashMap<Orientation,List<RoomOpening>> raumMitRichtungHM = r.getOpenings(); //neue Hashmap ist die HashMap des aufgerufenen Raumes, welche Richtung (Key) und ArrayList mit sämtlichenÖffnungen enthält
            for(Orientation or:raumMitRichtungHM.keySet()){ //wir durchlaufen jedes Keyset einzeln und können somit auf die Liste die zu der Orientierung dazu gehört zugreifen
                List<RoomOpening> alleOeffnungenList = raumMitRichtungHM.get(or); //neue Liste die alle Öffnungen eines Zimmers in eine Richtung enthält
                for (RoomOpening ro:alleOeffnungenList){    //jetzt kann diese Liste einzeln für jede Öffnung durchlaufen werden
                        numberOfOpenings++;         //jede Öffnung wird addiert, wenn alle Öffnungen einer Himmelsrichtung des Zimmertyps (rt) gezählt wurden,
                    //geht es weiter mit der nächsten Himmelsrichtung, da werden auch alle Öffnungen dazu summiert usw. bis sämtliche Öffnungen gezählt wurden
                    }
                }
            }
        return numberOfOpenings;
        }


    public List<Room> getAllConnectedRooms(Room room){      //die verbundenen Räume sind in der Öffnung Door gespeichert. Wenn man also alle Türen eines Zimmers hat, kann man hieraus die Verbindungsräume ausleden
        List<Room> alleVerbundenenRaume = new ArrayList<Room>();    //alle Verbindungsräume die zu den Türen gehören werden in dieser Liste abgelegt
        for(RoomType rt: rooms.keySet()){                   //erst mal wird die HashMap durchlaufen, um auf die Liste, die zu den RoomTypes gehört zugreifen zu können
            List<Room> alleRaume = rooms.get(rt);       //neue Raumliste wird aus Liste erstellt, die in der "rooms"-HashMap liegt. Rooms holt die Liste für jede einzelnen Key (Roomtype rt) rooms.get(rt);
            for(Room r:alleRaume){      //jetzt wird die Liste genommen und auf jeden einzelnen Raum in der Liste zugegriffen
                if(r.equals(room)){     //wenn dieser Raum der Raum ist, von dem wir die Verbindungsräume wissen wollen
                    for(Orientation or:r.getOpenings().keySet()){   //dann wird die HashMap diesen Raumes, die die Himmelrichtung und sämtliche zugehörige Öffnungen enthält, entsprechend der Himmelsrichtung durchlaufen
                        List<RoomOpening> alleOeffnungenVonRaum = r.getOpenings().get(or); //neue List, die alle Öffnungen einer Himmelsrichtung, des gewünschten Raumes enthält, ist gleich der Liste die in der HasMap gelegen ist
                        for(RoomOpening ro:alleOeffnungenVonRaum){  //aus dieser Liste können jetzt alle Öffnungen (einer Himmelsrichtung) angeschaut werden
                            if(ro instanceof Door){     //wenn die Öffnung eine Tür ist, kann der Nachbarraum der Tür angeschaut werden
                                if (((Door) ro).getRoom1().equals(r)){  // Tür speichert 2 Räume (eigenen Raum und Nachbarraum), wenn Raum1 der eigene Raum (also der Raum zu dem
                                    //die Verbindungsräume aufgelistet werden sollen) ist, dann wird Raum2 in die Übersichtsliste gelegt
                                    alleVerbundenenRaume.add(((Door) ro).getRoom2());}
                                else {  //ansonsten (wenn also Raum1 nicht der eigene Raum ist, dann muss Raum1 der Nachbarraum sein)
                                    alleVerbundenenRaume.add(((Door) ro).getRoom1());   //wird eben Raum1 in die Übersichtsliste gelegt
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
