public class MinNumber {
    public static void main(String[] args)
    {
        int arr[]={15,26,10,2,75,53};
        System.out.print("\nOriginal Array :");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println("\nThe minimum number is: " + min); }
}
