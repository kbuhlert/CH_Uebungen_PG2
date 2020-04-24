package Tiere_Vererbung;

public class Katze extends Animal{
    public Katze(String color, int augenzahl){
        super(color,augenzahl);
    }
    @Override
    public void walk(){
        System.out.println("Schleich Schleich");
    }

    @Override
    public void makeNoise(){
        System.out.println("Miau Miau");
    }
}
