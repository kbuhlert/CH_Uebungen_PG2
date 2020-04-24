package Orchester_Vererbung;

public class Gitarre extends Instrumente {


    public Gitarre(int lautstärke) {
        super(lautstärke);
    }


    @Override
    public int play() {
        System.out.println("Gitarre wird gespielt mit Lautstärke " + lautstärke);
        return lautstärke;
    }
}
