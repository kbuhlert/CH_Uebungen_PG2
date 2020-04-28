package Mitarbeiterinnen;

public class FixComissionEmployee extends Employee{

    protected double additionalComission;

    public FixComissionEmployee(String lastname, String firstname, String department, double baseSalary, double additionalComission) {
        super(lastname, firstname, department, baseSalary);
        this.additionalComission = additionalComission;
    }

    @Override
    public double getFullSalary (){
        return baseSalary + additionalComission;
    }
}
