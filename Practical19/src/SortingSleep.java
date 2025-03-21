class Asc extends Thread {
    Thread otherThread;
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(" " + i);
        }
        try {
            Thread.sleep(500);
            System.out.println("\n 500ms delay");
            otherThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } } }
class Desc extends Thread
{
    public void run()
    {
        for (int i = 100; i >= 1; i--)
        {
            System.out.print(" " + i);
        }
    }
}
public class SortingSleep {
    public static void main(String[] args) {
        Asc a1 = new Asc();
        Desc d1 = new Desc();
        a1.otherThread = d1;
        a1.start();
    } }