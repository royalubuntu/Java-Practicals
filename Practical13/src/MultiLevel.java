import java.util.*;
class Student
{
    String name;
    int id;
    Scanner sc = new Scanner(System.in);
    void getData()
    {
        System.out.println("Enter Name of Student :: ");
        name = sc.nextLine();
        System.out.println("Enter ID of Student :: ");
        id = sc.nextInt();
    }
    void dispaly()
    {
        System.out.println("Name :: "+name);
        System.out.println("ID :: "+id);
    }
}
class Marks extends Student
{
    int m1,m2,m3;
    float avg;
    void getData()
    {
        super.getData();
        System.out.println("Enter 3 Subject Marks :: \n ->");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        avg = m1+m2+m3/3;
    }
    void display()
    {
        super.dispaly();
        System.out.println("Average :: "+avg);
    }
}
class Sports extends Marks
{
    float gradePoints;
    void getData()
    {
        super.getData();
        System.out.println("Enter Sports Grade Points :: ");
        gradePoints = sc.nextFloat();
    }
    void display()
    {
        super.display();
        System.out.println("Sports Grade Points :: "+gradePoints);
    }
}
public class MultiLevel
{
    public static void main(String[] args) {
        Sports s = new Sports();
        s.getData();
        s.display();
    }
}
