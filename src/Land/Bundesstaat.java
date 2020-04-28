package Land;

import java.util.ArrayList;

public class Bundesstaat extends Land {
   private ArrayList<Land> laender;

    public Bundesstaat() {
        laender = new ArrayList<Land>();
    }
    public void addLand(Land land){
        laender.add(land);
    }

    @Override
    public double getBruttoSozialProdukt() {
        double bspSumme = 0;
        for(Land l:laender){
           bspSumme = bspSumme + l.getBruttoSozialProdukt();
        }
        return bspSumme;
    }
}
