import java.util.Scanner;

abstract class Employee01 {
    String name;
    double baseSalary;
    double bouns;

    public Employee01(String name, double baseSalary, double bouns) {
        this.baseSalary = baseSalary;
        this.bouns = bouns;
        this.name = name;

    }

    abstract double calculateSalary();

}

class Manager extends Employee01 {
    Manager(String name, double baseSalary, double bouns) {
        super(name, baseSalary, bouns);
    }

    double calculateSalary() {
        return baseSalary + bouns;
    }

    void displayInfor() {
        System.out.println("The name of Employee is : " + name);
        System.out.println("The salary of employee is $" + calculateSalary());
    }

}

class Programmer extends Employee01 {
    private double hourlyRate;
    private int extraHours;

    Programmer(String name, double baseSalary, double bouns, double hourlyRate, int extraHours) {
        super(name, baseSalary, bouns);
        this.hourlyRate = hourlyRate;
        this.extraHours = extraHours;
    }

    double calculateSalary() {
        return baseSalary + bouns + (hourlyRate * extraHours);

    }

    void displayInfor() {
        System.out.println("The name of Programmer is : " + name);
        System.out.println("The salary of employee is $" + calculateSalary());

    }
}

public class EmpSalary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of Employee : ");
        String name = sc.nextLine();
        System.out.print("Enter Salary : ");
        double baseSalary = sc.nextDouble();
        System.out.print("Entern bouns of Employee : ");
        double bouns = sc.nextDouble();
        System.out.print("Enter extra hours of employee : ");
        int extraHours = sc.nextInt();
        System.out.print("Enter the rate of hourly  : ");
        double hourlyRate = sc.nextDouble();
        Manager emp1 = new Manager(name, baseSalary, bouns);
        emp1.calculateSalary();
        emp1.displayInfor();
        Programmer emp = new Programmer(name, baseSalary, bouns, hourlyRate, extraHours);
        emp.calculateSalary();
        emp.displayInfor();

        sc.close();

    }
}