package Land;

public class LandApp {
    public static void main(String[] args) {

        Bundesstaat deutschland = new Bundesstaat();
        deutschland.addLand(new Bundesland(100080090.70,"Bayern"));
        deutschland.addLand(new Bundesland(790080090.70,"Hessen"));

        System.out.println(deutschland.getBruttoSozialProdukt());

    }
}
