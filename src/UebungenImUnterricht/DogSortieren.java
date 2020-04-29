package UebungenImUnterricht;

public class DogSortieren implements Comparable<DogSortieren>{
        public String eyeColor;
        public int weight;

        public DogSortieren(String eyeColor, int weight){
            this.eyeColor = eyeColor;
            this.weight = weight;
        }
        public DogSortieren(){
            this.eyeColor = "braun";
            this.weight = 10;
        }
        public void bellt(){
            System.out.println("wuff wuff");
        }
        // exkurs - was anderes - beispiel für überladen (overload)
 /*   public void bellt(String objekt){
        System.out.println("bellt " + objekt + "an");
    }*/

        @Override
        public String toString() {
            return "CHLDog{" +
                    "eyeColor='" + eyeColor + '\'' +
                    ", weight=" + weight +
                    '}';
        }

        @Override
        public int compareTo (DogSortieren dog){
            if(this.weight<dog.weight) return -1;
            if (this.weight>dog.weight) return 1;
            return 0;
        }


}
