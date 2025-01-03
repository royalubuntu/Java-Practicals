package Practical1;
import java.util.*;
public class Fibbonacci
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int no,n1=0,n2=1,n3,i;
        System.out.println("Enter Number :: ");
         no = sc.nextInt();
//        System.out.println(no);
        System.out.print(n1+"\t"+n2);
        for(i=2;i<no;++i)
        {
            n3=n1+n2;
            System.out.print("\t"+n3);
            n1=n2;
            n2=n3;
        }
    }
}
