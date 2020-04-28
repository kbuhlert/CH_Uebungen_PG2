package Mitarbeiterinnen;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeManager {

    protected ArrayList<Employee> employeeList;

    public EmployeeManager(){
        employeeList = new ArrayList<Employee>();
    }

    public void addemployee (Employee employee){
        employeeList.add(employee);
    }

    public double calcTotalSalary(){
        double totalSalary = 0;
        for(Employee e:employeeList){
            totalSalary += e.getFullSalary();
        }
        return totalSalary;
    }

    public HashMap<String,Double> getSalaryByDepartment(){
        HashMap<String,Double> salaryDepartment = new HashMap<>(); //neue HasMap zum Speichern des Departments (Key) und der zugehörigen Gehälter (Wert)
        for(Employee e:employeeList){       //geht durch jeden einzelnen Employee in der Liste
            if(salaryDepartment.containsKey(e.department)) {    //wenn es in Hashmap den Key "department des Employee, der gerade abgefragt wird" gibt und somit auch einen zugehörigen Wert
                double gehaltsSumme;            //zum Zwischenspeichern der Summe aus dem Hash-Map
                gehaltsSumme = salaryDepartment.get(e.department) + e.getFullSalary();//holt zugehörigen Gehaltswert des Keys "department" und addiert dazu den Wert des Employee as ArrayList
                salaryDepartment.put(e.department, gehaltsSumme); //legt neu addierte Gesamtsumme Gehalt beim zugehörigen Department-Key im HashMap ab
            } else {
                salaryDepartment.put(e.department,e.getFullSalary()); }//wenn das Department noch nicht in HAshMap gespeichert ist
                                                                    //dann wird das department im HashMap gespeichert und der dazugehörige Gehaltwert zugeordnet
        }
        return salaryDepartment;
        }

}
