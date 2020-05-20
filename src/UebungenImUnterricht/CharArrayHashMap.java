package UebungenImUnterricht;

import java.util.HashMap;

public class CharArrayHashMap {
    /*Im Konstruktor soll ein Array von Char übernommen
und in einer lokalen HashMap gespeichert werden.
 Schlüssel: Position im Array Wert: Character
 ‚a‘ ‚b‘ ‚c‘ wird also zu 0:‘a‘ 1:‘b‘ 2:‘c‘*/

    public char[] charArray;

    HashMap<Integer,Character> charMap = new HashMap<Integer,Character>();

    public CharArrayHashMap(char[] charArray) {
        this.charArray = charArray;
        for (int i=0; i<charArray.length;i++){
            char helper = charArray[i];
            charMap.put(i,helper);
        }
    }

    public void print(){
       /* for (Integer name: charMap.keySet()){
            String key = name.toString();
            String value = charMap.get(name).toString();
            System.out.println(key + " " + value);
        }*/
        for(int key=0; key<length();++key){
            System.out.println(charMap.get(key));
        }
    }
    //vorausgesetzt start und end sind die korrekten indizes (Positionen im Array)
    public void print(int start, int end){
        for (int i=start; i<=end; i++){
            System.out.println(charMap.get(i));
        }
    }

    public static void main(String[] args) {
       char[] chary = {'a','b','c','t','x'};
        CharArrayHashMap c = new CharArrayHashMap(chary);
        c.print();
        System.out.println("-----");
        c.print(2,4);

    }



    public int length (){
        return charMap.size();
    }

}
