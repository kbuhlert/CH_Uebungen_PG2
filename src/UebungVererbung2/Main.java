package UebungVererbung2;

public class Main {
    public static void main(String[] args) {
        Kunde a1 = new Kunde(123, "Hansi", "Hase");

        a1.doSpeak();

        a1.addAdresse(new Adresse("Grüne Gasse", "8020", "Graz", "Austria"));

        System.out.println(a1);
    }
}
