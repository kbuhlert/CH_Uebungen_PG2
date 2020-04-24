package Tiere_Vererbung;

public class Animal {
    protected String color;
    protected int augenzahl;

    public Animal(String color, int augenzahl) {
        this.color = color;
        this.augenzahl = augenzahl;
    }

    public void walk(){
        System.out.println("fortbewegen");
    }

    public void makeNoise(){
        System.out.println("Tiertypische Lautäußerung");
    }
    public void isswas(){
        System.out.println("Konsumation von Lieblingsessen");
    }

    public String getColor() {
        return color;
    }

    public int getAugenzahl() {
        return augenzahl;
    }
}
