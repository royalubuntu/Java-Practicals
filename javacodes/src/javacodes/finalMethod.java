package javacodes;


class bike{

      void run(){
        System.out.println("Running ..");
    }
}
class tata extends bike{

    void run(){
        System.out.println("Tata Cars..");
    }
}
public class finalMethod {
    public static void main(String[] args) {
        tata t=new tata();
        t.run();
    }
}
