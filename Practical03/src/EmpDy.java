
import java.util.*;
public class    EmpDy
{
    int empid;
    double salary;
    String name ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmpDy e = new EmpDy();
        System.out.println("Enter Employee ID : ");
        e.empid = sc.nextInt();
        System.out.println("Enter Employee Name : ");
        e.name = sc.next().toString();
        System.out.println("Enter Employee Salary : ");
        e.salary = sc.nextDouble();

        System.out.println("::::::::::::::::::::::::::::::::::: Displaying Employee Details  :::::::::::::::::::::::::::::::::::");

        System.out.println("Employee ID :: "+e.empid);
        System.out.println("Employee Name :: "+e.name);
        System.out.println("Employee Salary :: "+e.salary);
    }
}
