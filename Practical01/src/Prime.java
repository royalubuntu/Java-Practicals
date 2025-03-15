
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number, i;
        System.out.println("Enter Number to Check Number is Prime or Not :: ");
        number = sc.nextInt();

        if (number <= 1) {
            System.out.println("Not Prime");
        } else {

            boolean isPrime = true;
            for (i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }

            if (isPrime)
                System.out.println("Prime Number");
            else
                System.out.println("Not Prime");
        }
    }
}
