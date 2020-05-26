package UebungenImUnterricht;

import java.util.HashMap;

public class CharArray2 {

    private HashMap<Integer,Character> charverwaltung;

    public CharArray2(char[] charArray) {

        charverwaltung = new HashMap<>();

        for (int i=0; i<charArray.length; i++){
            charverwaltung.put(i,charArray[i]);
        }
    }

    public void print(){
        for(Integer i:charverwaltung.keySet()){
            System.out.println(i + ": " + charverwaltung.get(i));
        }
    }

    public void printStartEnde (int start, int ende){
        for(int i=start; i<=ende; i++){
            System.out.println(charverwaltung.get(i));
        }

    }
}
