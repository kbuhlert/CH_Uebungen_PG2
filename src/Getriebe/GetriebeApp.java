package Getriebe;

public class GetriebeApp {

        public static void main(String[] args) {
            Getriebe brumm = new Getriebe(-2, 6);


            try {
                brumm.setGang(3);
                brumm.setGang(5);
                brumm.setGang(6);
                brumm.setGang(0);
                brumm.setGang(-2);
                System.err.println("sollte gehen bis hier und jetzt getriebeschutz");
                brumm.setGang(2);
            } catch (GetriebeSchutzException e) {
                e.printStackTrace();
            } catch (GangExistiertNichtException e) {
                e.printStackTrace();
            }
            System.err.println("gang existiert nicht -3");
            try {
                brumm.setGang(-3);

            } catch (GetriebeSchutzException e) {
                e.printStackTrace();
            } catch (GangExistiertNichtException e) {

                e.printStackTrace();
            }
            System.err.println("getriebschutz test");
            try {
                brumm.setGang(2);

            } catch (GetriebeSchutzException e) {
                e.printStackTrace();
            } catch (GangExistiertNichtException e) {

                e.printStackTrace();
            }
            System.err.println("erniedrigen existiert nicht");

            try {
                brumm.gangErhoehen();
                brumm.gangErhoehen();
                brumm.gangErhoehen();
                brumm.gangErhoehen();
                brumm.gangErhoehen();
                brumm.gangErhoehen();
                brumm.gangErhoehen();
                brumm.gangErhoehen();
                brumm.gangErhoehen(); // einer zu viel
            } catch (GangExistiertNichtException e) {
                e.printStackTrace();
            }

        }

}
