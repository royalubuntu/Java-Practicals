
import java.util.Scanner;

public class Factor
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number,i;

        System.out.println("Enter Number :: ");
        number = sc.nextInt();

        for(i=1;i<=number;i++)
        {
            if(number % i ==0)
            {
                System.out.print(i+" ");
            }
        }

    }
}
