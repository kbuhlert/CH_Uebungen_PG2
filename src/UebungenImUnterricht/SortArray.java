package UebungenImUnterricht;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arraySort = {1,2,3,6,10,5,8,11};
        String[] strinArray = {"Susi", "Hansi", "Hubsi"};
        DogSortieren[] dogArray = {new DogSortieren("Blue",20),new DogSortieren("Brown",14),new BeagleSortieren("Blue",17,"Würstchen")};
         System.out.println(Arrays.toString(arraySort));
        Arrays.sort(arraySort);     //Sortiert nach natürlicher Ordnung (Zahlen aufsteigend)
        System.out.println(Arrays.toString(arraySort));

        Arrays.sort(strinArray);     //Sortiert nach natürlicher Ordnung (Text nach ABC)
        System.out.println(Arrays.toString(strinArray));
        Arrays.sort(dogArray);
        System.out.println(Arrays.toString(dogArray));
    }
}
