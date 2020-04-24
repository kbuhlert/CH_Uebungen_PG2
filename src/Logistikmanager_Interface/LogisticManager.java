package Logistikmanager_Interface;

import java.util.ArrayList;

public class LogisticManager {

    ArrayList<Moveable> movableObjects = new ArrayList<Moveable>();


    public void addObject (Moveable movableObject){
        movableObjects.add(movableObject);
    }

    public void moveAll (String destination){
        for(Moveable m:movableObjects){
            m.move(destination);
        }
    }


}
