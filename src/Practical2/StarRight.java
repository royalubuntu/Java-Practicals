package Practical2;

public class StarRight
{
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=4;i++)
        {
            for (j=1;j<=4-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}