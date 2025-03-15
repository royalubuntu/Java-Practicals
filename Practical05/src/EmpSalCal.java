// 3. Create Base Class Employee with method calculateSalary() ,
// Create 2 Subclasses Manager & Programmer & Override Calculate Salary method in each Class ,
// Calculate & return their salary Based on Specific Role.
class Employee
{
    void calculateSalary()
    {

    }
}
class Manager extends Employee
{
    double baseSalary,bonus;
    Manager(double baseSalary, double bonus)
    {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }
    void calculateSalary()
    {
        double salary = baseSalary+bonus;
        System.out.println("Total Salary of Manager is "+salary+" /-");
    }
}
class Programmer extends Employee
{
    double baseSalary,noOfProject;
    Programmer(double baseSalary,double noOfProject)
    {
        this.baseSalary= baseSalary;
        this.noOfProject = noOfProject;
    }
    void calculateSalary()
    {
        double salary = baseSalary+(noOfProject*1000);
        System.out.println("Total Salary of Programmer is "+salary+" /-");
    }
}

public class EmpSalCal {
    public static void main(String[] args) {
    Manager manager = new Manager (50000,1000);
    Programmer programmer = new Programmer(70000,5);
    manager.calculateSalary();
    programmer.calculateSalary();

    }
}
