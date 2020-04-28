package Mitarbeiterinnen;

public class Employee {
    protected String lastname;
    protected String firstname;
    protected String department;
    protected double baseSalary;

    public Employee(String lastname, String firstname, String department, double baseSalary) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.department = department;
        this.baseSalary = baseSalary;
    }

    public double getFullSalary(){  //wenn nur baseSalary gebraucht würde wäre getter nicht notwendig, da es aber in Tochterklassen
        return baseSalary;          // überschrieben und verändert wird gibt es hier eine Methode um an baseSalary ranzukommen
    }

    /*public String getDepartment() {       Getter ist nicht Notwendig, da Zugriff auf Attribut vererbt wird
        return department;
    }*/
}
