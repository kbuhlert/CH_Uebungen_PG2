package Ente;

public class FlugEnte extends Ente{

    private int gewichtFedern;

    public FlugEnte(String name, int gewicht, int gewichtFedern) {
        super(name, gewicht);
        this.gewichtFedern = gewichtFedern;
    }

    @Override
    public int getFullWeight (){
        int gesamtgewicht = this.gewichtFedern + super.gewicht;
        return gesamtgewicht;
    }

    @Override
    public String makeNoise(){
        return "Quak Swoosh Quak";
    }

    @Override
    public String toString() {
        return name + " " + getFullWeight();
    }
}
