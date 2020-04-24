package Tiere_Vererbung;

public class Lion extends Animal {

    public Lion(String color, int augenzahl) {
        super(color, augenzahl);
    }

    @Override
    public void walk(){
        System.out.println("Durch Savanne schlendern");
    }

    @Override
    public void makeNoise(){
        System.out.println("Rowww Rowww");
    }
}
