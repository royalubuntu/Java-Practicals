// Develop a program to make use of try , catch & finally block

public class PredefinedException extends Exception
{
    public static void main(String[] args) {
        try
        {
            int num = 10 / 0;
            System.out.println("Result is "+num);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Cannot Divide Any Number with ZERO : "+e.getMessage());
        }
        finally {
            System.out.println("Program Executed Sucessfully ");
        }
    }

}
