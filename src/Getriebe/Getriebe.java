package Getriebe;

public class Getriebe {
    private int gang;
    private int minGang;
    private int maxGang;

    public Getriebe(int minGang, int maxGang) {
        this.gang = 0;
        this.minGang = minGang;
        this.maxGang = maxGang;
    }

    public int getGang() {
        return gang;
    }

    public int getMinGang() {
        return minGang;
    }

    public int getMaxGang() {
        return maxGang;
    }

    public void setGang(int gang) throws GangExistiertNichtException, GetriebeSchutzException {
        //kein Umschalten, wenn eingegebener Gang außerhalb von Min/Max liegt
        if(gang>maxGang || gang<minGang)
        {
            throw new GangExistiertNichtException("Der Gang " + gang +  " ist zu groß oder zu klein");
        }

        //Wenn von positiven in negativen oder umgekehrt geschaltet wird (beim Multiplizieren eines positiven mit negativen Wert kommt negativer Wert raus)
        //(wenn in Leerlauf geschaltet wurde, wäre this.gang = 0 und this.gang*gang =0) soll auch eine Exception geworfen werden
        if (this.gang*gang<0){
            throw new GetriebeSchutzException("Umschalten zwischen Vorwärts und Rückwärtsgang geht nur über Leerlauf");
        }
        this.gang = gang;
    }

    public void gangErhoehenUm (int anzahl) throws GangExistiertNichtException {

        if(this.gang+anzahl>maxGang){
            this.gang = maxGang;
            throw new GangExistiertNichtException("Es kann nicht höher als bis " + maxGang + " geschaltet werden");
        }
        this.gang += anzahl;
    }

    public void gangErhoehen () throws GangExistiertNichtException {

        if(this.gang==maxGang){
            throw new GangExistiertNichtException("Es kann nicht höher als bis " + maxGang + " geschaltet werden");
        }
        this.gang++;
    }
}
