// Locking class used for synchronization
class TableLock {
    void printTable(int n) {
        synchronized (this) { // Synchronized block inside another class
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}

// Main Table class that uses the locking class
class Table {
    TableLock lock = new TableLock(); // Creating an instance of locking class

    void printTable(int n) {
        lock.printTable(n); // Delegating call to locking class
    }
}

// Thread classes using Table class
class MyThread1 extends Thread {
    Table t;
    MyThread1(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(5);
    }
}

class MyThread2 extends Thread {
    Table t;
    MyThread2(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(100);
    }
}

// Main class to run the program
public class SynchronizedBlock {
    public static void main(String[] args) {
        Table obj = new Table(); // Shared object
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);

        t1.start();
        t2.start();
    }
}
