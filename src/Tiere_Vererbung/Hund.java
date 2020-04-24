package Tiere_Vererbung;

public class Hund extends Animal{

    public Hund(String color, int augenzahl){
        super(color,augenzahl);
    }

    @Override
    public void walk(){
        System.out.println("Auf vier Pfoten rennen");
    }

    @Override
    public void makeNoise(){
        System.out.println("Wau Wau");
    }
}
