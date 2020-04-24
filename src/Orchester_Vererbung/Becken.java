package Orchester_Vererbung;

public class Becken extends Instrumente{


    public Becken(int lautstärke) {
        super(lautstärke);
    }


    @Override
    public int play() {
        System.out.println("Becken wird geschlagen mit Lautstärke " + lautstärke);
        return lautstärke;
    }
}
