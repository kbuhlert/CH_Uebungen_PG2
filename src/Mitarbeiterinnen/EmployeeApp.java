package Mitarbeiterinnen;

public class EmployeeApp {

    public static void main(String[] args) {
        Employee helgaList = new Employee("List","Helga","Softwaredev",3400.0);
        Employee johannList = new Employee("List","Johann","Softwaredev",2800.0);
        Employee herbertHelm = new Employee("Helm","Herbert","Softwaredev",4400.0);
        Employee helmeHeine = new Employee("Heine","Helme","Empfang",1900.0);
        FixComissionEmployee tinaTunte = new FixComissionEmployee("Tunte","Tina","Empfang",1950.0, 255.50);
        PercentCommisionEmployee woodyWhippet = new PercentCommisionEmployee("Whippet","Woody", "Personal Assistant",6000.66,0.3);


        EmployeeManager verwaltungsListe = new EmployeeManager();
        verwaltungsListe.addemployee(helgaList);
        verwaltungsListe.addemployee(johannList);
        verwaltungsListe.addemployee(herbertHelm);
        verwaltungsListe.addemployee(helmeHeine);
        verwaltungsListe.addemployee(tinaTunte);
        verwaltungsListe.addemployee(woodyWhippet);

        System.out.println(verwaltungsListe.getSalaryByDepartment());
        System.out.println("Tina verdient: " + tinaTunte.getFullSalary());
        System.out.println("Woody verdient: " + woodyWhippet.getFullSalary());
        System.out.println("Helme verdient: " + helmeHeine.getFullSalary());
    }


}
