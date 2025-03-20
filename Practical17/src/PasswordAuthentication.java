import java.util.*;
public class PasswordAuthentication {
    private static final String password = "musaib1234";
    public static void authenticate(String inputPassword)
    {
        if(!inputPassword.equals(password))
        {
            throw new SecurityException("Authentication Failed :  Incorrect Password");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password :: ");
        String pswd = sc.nextLine();

        try
        {
            authenticate(pswd);
            System.out.println("Access Granted :  You Have Sucessfully logged in !!!");
        }
        catch (SecurityException e)
        {
            System.out.println("Error : "+e.getMessage());
        }
        finally {
            System.out.println("Program Executed Sucessfully ");
        }
    }
}