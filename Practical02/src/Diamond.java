
public class Diamond
{
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=4;i++)
        {
            for (j=1;j<=4-i;j++)
            {
                System.out.print(" ");
            }
            for (j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=4-1;i>=1;i--)
        {
            for (j=1;j<=4-i;j++)
            {
                System.out.print(" ");
            }
            for (j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
