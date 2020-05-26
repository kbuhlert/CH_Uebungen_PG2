package Kindergarten2;

import java.util.Collections;

public class KindergartenApp {

    public static void main(String[] args) {

        Kindergarten2 hasengruppe = new Kindergarten2("hasen");

        hasengruppe.addKind(new Kind2("Susi","Sorglos",4));
        hasengruppe.addKind(new Kind2("Jochen","Sorglos",6));
        hasengruppe.addKind(new Kind2("Karin","Haber",3));
        hasengruppe.addKind(new Kind2("Didi","Denkste",3));
        hasengruppe.addKind(new Kind2("Erns","Nichtlustig",5));

        System.out.println(hasengruppe.getAlleKinder());

        hasengruppe.sortAge();
        System.out.println(hasengruppe.getAlleKinder());

        hasengruppe.sortAlphabetical();
        System.out.println(hasengruppe.getAlleKinder());


    }


}
