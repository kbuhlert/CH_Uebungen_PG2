package Ente2;

public class FlugEnte2 extends Ente2{

    private int gewichtFedern;

    public FlugEnte2(String name, int gewicht, int gewichtFedern) {
        super(name, gewicht);
        this.gewichtFedern = gewichtFedern;
    }

    @Override
    public int getFullWeight() {
        return this.gewichtFedern + gewicht;
    }

    @Override
    public String makeNoise() {
        return "Ich fliege! Quak";
    }

    @Override
    public String toString() {
        return "FlugEnte2{" +
                "name='" + name + '\'' +
                ", gewicht=" + this.getFullWeight() +
                '}';
    }
}
