import java.util.*;
interface Gross
{
    double ta=0.10; // 0.10 means 10%
    double da = 0.20;// 0.20 means 20%
    public double gross_sal(double basicSalary , double hra);
}
class Employee
{
    Scanner sc = new Scanner(System.in);
    String name ;
    double basicSalary ;
    public void basic_sal()
    {
        System.out.println("Enter Name :: ");
        name = sc.nextLine();
        System.out.println("Enter Basic Salary :: ");
        basicSalary = sc.nextDouble();
    }

}
class Salary extends Employee implements Gross
{  double hra ;
          public double gross_sal(double basicSalary , double hra)
    {
            return basicSalary + (ta*basicSalary) + (da*basicSalary) + hra;
    }
    public void display_salary() //
    {
        hra = 0.30 * basicSalary;
        double grossSalary = gross_sal(basicSalary, hra);
        System.out.println("\n--- Salary Breakdown ---");
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: ₹" + basicSalary);
        System.out.println("Travel Allowance (TA): ₹" + (ta * basicSalary));
        System.out.println("Dearness Allowance (DA): ₹" + (da * basicSalary));
        System.out.println("House Rent Allowance (HRA): ₹" + hra);
        System.out.println("Gross Salary: ₹" + grossSalary);
    }
}
public class EmployeeSalaray
{
    public static void main(String[] args) {
        Salary s = new Salary();
        s.basic_sal();
        s.display_salary();
    }
}
