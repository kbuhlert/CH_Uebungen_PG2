package Land;

public class Bundesland extends Land{
    private double bruttoSozialProdukt;
    private String bundesland;

    public Bundesland(double bruttoSozialProdukt, String bundesland) {
        this.bruttoSozialProdukt = bruttoSozialProdukt;
        this.bundesland = bundesland;
    }

    @Override
    public double getBruttoSozialProdukt() {
        return bruttoSozialProdukt;
    }
}
