package UebungenImUnterricht;

public class BeagleSortieren extends DogSortieren{
        public String lovedFood;

        public BeagleSortieren(String lovedFood)
        {
            // standardmaessig ruft java hier den konstruktor vom CHLDog ohne Parameter auf
            this.lovedFood = lovedFood;
            bellt();
        }
        public BeagleSortieren(String eyeColor, int weight, String lovedFood)
        {
            // standardmaessig ruft java hier den konstruktor vom CHLDog ohne Parameter auf
            // mit super beziehen wir uns auf die basisklasse des aktuellen objekts (vgl. this)
            super(eyeColor, weight);
            this.lovedFood = lovedFood;
            bellt();
        }

        // wir überschreiben eine methode

        @Override
        public void bellt() {
            //super.bellt();
            System.out.println("wau wau");
        }

        @Override
        public String toString() {
            //super.bellt(); // rufe bellt der basisklasse auf -> wuff wuff
            //bellt(); // rufe mein eigenes bellt auf -> wau wau
            return "CHLBeagle{" +
                    "lovedFood='" + lovedFood + '\'' +
                    ", eyeColor='" + eyeColor + '\'' +
                    ", weight=" + weight +
                    '}';
        }

}
