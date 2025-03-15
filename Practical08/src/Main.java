import java.util.Scanner;
class Student {
    int id;
    String name;
    int marks;
    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\tName : ");
        name = scanner.nextLine();
        System.out.print("\tId : ");
        id = scanner.nextInt();
        System.out.print("\tMarks : ");
        marks = scanner.nextInt();
    }
    void output() {
        System.out.println("\tName: " + name+" Id : "+id+" Marks : "+marks); }
}
public class Main {
    public static void main(String args[]) {
        Student[] students = new Student[10];
        System.out.println("\n\tEnter details for 10 student :");
        for (int i = 0; i < 10; i++) {
            students[i] = new Student();
            students[i].input();

            System.out.println(); }
        System.out.println("\tStudent Details:");
        for (int i = 0; i < 10; i++) {
            students[i].output();
            System.out.println();
        }
    }
}
