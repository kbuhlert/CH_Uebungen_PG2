package Logistikmanager_Interface;

public class LogisticApp {
    public static void main(String[] args) {

        LogisticManager walter = new LogisticManager();

        Car vw = new Car("VW",Color.Brown, 2200.0);
        Shirt longsleeve = new Shirt("Levis", Color.Black, Size.MEDIUM);


       walter.addObject(vw);
       walter.addObject(longsleeve);

       walter.moveAll("Graz");

    }
}
