package Inheritance_Polymorphism_Abstraction;

abstract class Employee {
    protected String id;
    protected String name;
    protected double baseSalary;

    Employee(String id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary();

    public String toString() {
        return "ID: " + id + ", Name: " + name +
               ", Salary: " + calculateSalary();
    }
}
class PermanentEmployee extends Employee {
    private double bonus;

    PermanentEmployee(String id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    double calculateSalary() {
        return baseSalary + bonus;
    }
}

class ContractEmployee extends Employee {
    private double tax;
    private double serviceCharge;

    ContractEmployee(String id, String name, double baseSalary,
                     double tax, double serviceCharge) {
        super(id, name, baseSalary);
        this.tax = tax;
        this.serviceCharge = serviceCharge;
    }

    double calculateSalary() {
        return baseSalary - tax - serviceCharge;
    }
}

class Intern extends Employee {
    private double stipend;

    Intern(String id, String name, double stipend) {
        super(id, name, 0);
        this.stipend = stipend;
    }

    double calculateSalary() {
        return stipend;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {

        Employee e1 = new PermanentEmployee("E101", "Ram", 50000, 5000);
        Employee e2 = new ContractEmployee("E102", "Raj", 40000, 2000, 1000);
        Employee e3 = new Intern("E103", "Ravi", 15000);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}