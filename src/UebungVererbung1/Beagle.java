package UebungVererbung1;

public class Beagle extends Hund {

    public String lieblingsessen;

    public Beagle(String augenfarbe, int gewicht, String lieblingsessen) {
        super(augenfarbe, gewicht);
        this.lieblingsessen = lieblingsessen;
    }

    public Beagle(String lieblingsessen) {
        //Konstruktor von Hund (ohne Parameter) wird automatisch aufgerufen
        this.lieblingsessen = lieblingsessen;
        bellt();
    }

    @Override
    public String toString() {
        return "Beagle{" +
                "lieblingsessen='" + lieblingsessen + '\'' +
                ", augenfarbe='" + augenfarbe + '\'' +
                ", gewicht=" + gewicht +
                '}';
    }
}
