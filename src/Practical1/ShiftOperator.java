package Practical1;
import java.util.*;
public class ShiftOperator
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();  // Input number

        // Perform left shift (shift by 1 bit)
        int leftShift = number << 1;

        // Perform right shift (shift by 1 bit)
        int rightShift = number >> 1;

        // Display results
        System.out.println("Original number: " + number);
        System.out.println("Left shift by 1: " + leftShift);
        System.out.println("Right shift by 1: " + rightShift);
    }

}
