package Practical1;

import java.util.Scanner;

public class Armstrong
{
    public static void main(String[] args) {
        int number,temp,nDigits=0,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to Check Number is Armstrog or Not :: ");
        number = sc.nextInt();
        int originalNum = number;
        temp =number;

        while(temp>0) // This loop is used to count digits
        {
            nDigits++;
            temp /= 10;
        }
//        System.out.println(nDigits);
        while (number>0)
        {
            int digit = number % 10;
            sum += Math.pow(digit,nDigits); // Math.pow() is used to check Any digit of number
            number /=10;
        }
        if(sum == originalNum)
        {
            System.out.println(originalNum+" is Armstrong Number");
        }
        else
        {
            System.out.println(originalNum+" is not Armstrong number");
        }
    }
}
