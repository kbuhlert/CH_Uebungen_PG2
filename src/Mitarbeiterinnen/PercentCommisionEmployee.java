package Mitarbeiterinnen;

public class PercentCommisionEmployee extends Employee{
    protected double percentComission; //Angabe: 10% = 0.1; 65% = 0.65

    public PercentCommisionEmployee(String lastname, String firstname, String department, double baseSalary, double percentComission) {
        super(lastname, firstname, department, baseSalary);
        this.percentComission = percentComission;
    }

    @Override
    public double getFullSalary(){

        return baseSalary + (baseSalary * percentComission);
    }
}
