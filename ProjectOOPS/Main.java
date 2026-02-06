package ProjectOOPS;
// EMPLOYEE PAYROLL SYSTEM...

import java.util.ArrayList;

// ABSTRACT CLASSS
abstract class Employee {
    // using Access Modifiers
    private String name;
    private int id;

    // Constructor..Parameterized.
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Encapsulation :- getName Method..
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // abstract Method 
    public abstract double calculateSalary();

    // Polymor:- Override. to string Method
    public String toString() {
        return " Employee [name = " + name + ", id = " + id + ",  salary = " + calculateSalary() + "] ";

    }
}


//  Another class Full Time..
class FullTimeEmployee extends Employee{

    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary)
    {
        // use Super Method bcz another class data access..
        super(name, id);
        this.monthlySalary = monthlySalary;
    
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}


//  Another Class Partime ..

class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;

    }
    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}


//  Another Class Payroll System.

class PayrollSystem{
    // List is collection of Similar Data types.. 
    private ArrayList<Employee> employeeList;

    public PayrollSystem(){
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee); //arrayList Function use .. here ....
    }

    public void removeEmployee(int id){
        Employee employeeToRemove = null;
        // For Each Loop...
        for(Employee employee : employeeList) {
            if(employee.getId() == id){
                employeeToRemove = employee;
                break;
            }
        }
        if(employeeToRemove != null){
            employeeList.remove(employeeToRemove); // Remove All Details ..
        }
    }

    public void displayEmployee(){
        for(Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        
        PayrollSystem ps = new PayrollSystem();
        FullTimeEmployee fts = new FullTimeEmployee("Vikash", 01, 70000);
        PartTimeEmployee pte = new PartTimeEmployee("Raman", 02, 15, 625);

        //  add 
        ps.addEmployee(fts);
        ps.addEmployee(pte);
        System.out.println("Initial Employee Details: ");
        ps.displayEmployee();
        System.out.println("Removing Employee");
        ps.removeEmployee(2);
        System.out.println("Remaining Employee Details");
        ps.displayEmployee();

    }
    
}
