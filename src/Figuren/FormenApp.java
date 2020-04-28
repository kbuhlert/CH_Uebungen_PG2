package Figuren;

public class FormenApp {
    public static void main(String[] args) {
        FormenManager derVerwalter = new FormenManager();
        derVerwalter.addFormen(new Kreis(20));
        derVerwalter.addFormen(new Kreis(850));
        derVerwalter.addFormen(new Kreis(300));
        derVerwalter.addFormen(new Kreis(900));

        derVerwalter.addFormen(new Rechteck(200.0,300.0));
        derVerwalter.addFormen(new Rechteck(350.0,400.0));
        derVerwalter.addFormen(new Rechteck(600.0,700.0));
        derVerwalter.addFormen(new Rechteck(10.0,30.0));

        System.out.println(derVerwalter.getDurchschittFlaeche());
        System.out.println(derVerwalter.getMaxUmfang());
        System.out.println(derVerwalter.getFlaechenachKategorie());

    }
}
