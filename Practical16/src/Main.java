class MobileOS
{
    public  void display()
    {
        System.out.println(" Mobile OS: The foundation of all mobile operating systems. ");
    }
}
class Android extends MobileOS
{
    @Override
    public void display()
    {
        System.out.println("Android OS: An open-source operating system based on Linux.");
    }
}
class iOS extends Android
{
    public void display()
    {
        System.out.println("iOS: A closed-source operating system developed by Apple.");
    }
}

public class Main {
    public static void main(String[] args) {
    iOS i = new iOS();
    i.display();

    }
}