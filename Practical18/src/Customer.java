import java.util.*;
class BalanceException extends Exception
{
    BalanceException(String message)
    {
        super(message);
    }
}
public class Customer
{
    public static double minBalance = 1500;
    public static void checkBalance(double balance) throws BalanceException
    {
        if(balance >= minBalance)
        {
            System.out.println("Your Balance  "+ balance);
        }
        else
        {
           throw new BalanceException("Balance is Insufficient");
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name :: ");
        String name = sc.nextLine();
        System.out.println("Enter Balance  :: ");
        double balance = sc.nextDouble();

        try
        {
            checkBalance(balance);

        }
        catch (BalanceException e)
        {
            System.out.println("Insufficient Balance ");
        }
    }
}
