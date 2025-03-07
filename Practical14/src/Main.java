import java.util.Scanner;

abstract class Wipro {
    abstract void printInfo();
}

class Employee extends Wipro {
    int empid;
    String name;
    int age;
    float salary;

    Employee(int empid, String name, int age, float salary) {
        this.empid = empid;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void printInfo() {
        System.out.println("Employee ID :: " + empid);
        System.out.println("Employee Name :: " + name);
        System.out.println("Employee Age :: " + age);
        System.out.println("Employee Salary :: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        int i;
        Employee[] emp = new Employee[5]; // Size of the array should be 2 as per the first loop
        Scanner sc = new Scanner(System.in);
        int empid;
        String name;
        int age;
        float salary;


        for (i = 0; i < 5; i++) {
            System.out.println("Enter Details for Employee " + (i + 1));
            System.out.print("Enter Name: ");
            name = sc.nextLine(); // Reads the full line input for name
            System.out.print("Enter ID: ");
            empid = sc.nextInt();
            System.out.print("Enter Age: ");
            age = sc.nextInt();
            System.out.print("Enter Salary: ");
            salary = sc.nextFloat();
            sc.nextLine();  // Consume the newline left by nextFloat
            emp[i] = new Employee(empid, name, age, salary);
        }

        // Now print the employee details
        System.out.println("\nEmployee Information: ");
        for (i = 0; i < 5; i++) {
            System.out.println("----------------++++++++++ Display Information For Employee "+(i+1)+"++++++++++----------------");
            emp[i].printInfo(); // Calls printInfo() to display employee details
        }
    }
}
