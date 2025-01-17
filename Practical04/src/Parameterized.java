public class Parameterized
{
Parameterized(int id, String name)  // Constructor With arguments is known as Parameterized Constructor
{
    System.out.println("Student Id = "+id);
    System.out.println("Student Name = "+name);
}

    public static void main(String[] args) {
        Parameterized p = new Parameterized(64,"Musaib");
    }
}
