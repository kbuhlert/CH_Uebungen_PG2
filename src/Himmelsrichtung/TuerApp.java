package Himmelsrichtung;

public class TuerApp {
    public static void main(String[] args) {
        Tuer wohnungstuer = new Tuer(90.0,210.0, Himmelsrichtung.SUEDEN);
        System.out.println(wohnungstuer.getTueroeffnung());
        System.out.println(wohnungstuer);

    }
}
