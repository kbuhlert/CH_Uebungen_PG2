package UebungVererbung1;

public class Hund {
    public String augenfarbe;
    public int gewicht;

    public Hund(String augenfarbe, int gewicht) {
        this.augenfarbe = augenfarbe;
        this.gewicht = gewicht;
    }

    public Hund() {
        this.augenfarbe = "braun";
        this.gewicht = 10;
    }

    public void bellt(){
        System.out.println("Wuff Wuff");
    }

    @Override
    public String toString() {
        return "Hund{" +
                "augenfarbe='" + augenfarbe + '\'' +
                ", gewicht=" + gewicht +
                '}';
    }
}
