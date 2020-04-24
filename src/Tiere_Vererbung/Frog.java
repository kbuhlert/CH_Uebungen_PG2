package Tiere_Vererbung;

public class Frog extends Animal{
    public Frog(String color, int augenzahl) {
        super(color, augenzahl);
    }
    @Override
    public void walk(){
        System.out.println("Hüpf Hüpf");
    }

    @Override
    public void makeNoise(){
        System.out.println("Quak Quak");
    }

    public void gehSchwimmen(){
        System.out.println("Plitsch, Platsch, das Wasser ist nass!");
    }
}
