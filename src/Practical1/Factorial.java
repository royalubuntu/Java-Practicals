package Practical1;

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number to Find Factorial ::  ");
        int number = sc.nextInt();
        int factorial=1;
        for (int i=1;i<=number;i++)
        {
            factorial*=i;
        }
        System.out.println(factorial);
    }
}
