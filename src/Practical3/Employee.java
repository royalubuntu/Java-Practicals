package Practical3;

public class Employee
{
    int empid = 100;
    double salary = 55000.24;
    String name = "John";
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println("Employee ID :: "+e.empid);
        System.out.println("Employee Name :: "+e.name);
        System.out.println("Employee Salary :: "+e.salary);
    }
}
