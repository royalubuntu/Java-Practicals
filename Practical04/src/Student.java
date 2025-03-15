// This is Constructor Overloading Program
public class Student
{
 int id;
 String name;
 Student() // Constructor without Parameter is known as Default Constructor
 {
  System.out.println("This is Default Constructor ");
 }

 Student(int id,String name) // Constructor With arguments is known as Parameterized Constructor
 {
  System.out.println("Student Id = "+id);
  System.out.println("Student Name = "+name);
 }
 Student(int id,String name,float marks) // Constructor With arguments is known as Parameterized Constructor
 {
  System.out.println("Student Id = "+id);
  System.out.println("Student Name = "+name);
  System.out.println("Student Name = "+marks);
 }
 public static void main(String[] args) {
  Student  s1 = new Student();
  System.out.println("==========================================");

  Student  s2 = new Student(64,"Musaib");

  System.out.println("==========================================");
  Student  s3 = new Student(64,"Musaib",84.86f);
 }
}
