class Even extends Thread
{
    public void run()
    {
        for(int i = 1; i<=50;i++)
        {
            if (i%2==0)
                System.out.print(" "+i);
        }
    }
}
class Odd extends Thread
{
    public void run()
    {
        for (int i=1;i<=50;i+=2)
        {
            System.out.print("  "+i);
        }
    }
}

public class EvenOdd
{
    public static void main(String[] args) {
        Odd o = new Odd();
        Even e = new Even();
        o.start();
        e.start();
    }
}