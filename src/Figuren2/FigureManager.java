package Figuren2;

import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {

    ArrayList<Figure> figurenManager;

    public FigureManager() {
        figurenManager = new ArrayList<Figure>();
    }

    public void add (Figure f){
        figurenManager.add(f);
    }

    public double getMaxPerimeter(){
        double max = 0;
        for (Figure f : figurenManager){
            if (f.getPerimeter()>max){
                max = f.getPerimeter();
            }
        }
        return max;
    }

    public double getAverageSize (){
        double summe = 0;
        for (Figure f : figurenManager){
            summe += f.getArea();
        }
        return summe/figurenManager.size();
    }

    public HashMap<String, Double> getAreaBySize (){
        HashMap<String,Double> hm = new HashMap<>();
        double klein = 0;
        double mittel = 0;
        double gross = 0;

        for (Figure f:figurenManager){
            if(f.getArea()<1000){
                klein+=f.getArea();
            }
            if(f.getArea()>=1000 && f.getArea()<5000){
                mittel+=f.getArea();
            }
            if(f.getArea()>=5000){
                gross+=f.getArea();
            }
        }
        hm.put("Klein",klein);
        hm.put("Mittel", mittel);
        hm.put("Gross",gross);
        return hm;
    }
}
