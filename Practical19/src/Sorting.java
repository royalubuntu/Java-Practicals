class Ascending implements Runnable // Here Thread is created by using Runnable Interface
{
    public void run()
    {
        for (int i=1;i<=50;i++)
        {
            System.out.println("Asec :: "+i);
        }
    }

}
class Descending implements Runnable
{
    public void run()
    {
             for (int i=50;i>=1;i--)
        {
            System.out.println("Desc :: "+i);
        }
    }
}


public class Sorting
{
    public static void main(String[] args) {
//        Creating Instance of Ascending & Descending Class
        Ascending a = new Ascending();
        Descending d = new Descending();

//        Creating Instance of Thread Class
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(d);
        t1.start();
        t2.start();


    }
}
