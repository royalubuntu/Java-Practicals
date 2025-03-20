import java.util.*;
class NotMatchException extends Exception
{
    NotMatchException(String message)
    {
        super(message);
    }
}
public class UserDefinedException {
     public static String str =  "India";
    public static void checkString(String strInput) throws NotMatchException
    {
        if(!strInput.equals(str))
        {
            throw new NotMatchException("String is Not Match");
        }
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :: ");
     String input = sc.nextLine();

     try
     {
         checkString(input);
         System.out.println("String Matched Successfully ");
     }
     catch (NotMatchException e)
     {
         System.out.println("Invalid String !!! "+e.getMessage());
     }
    }
}