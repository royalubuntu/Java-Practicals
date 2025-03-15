public class Ascending
{
    public static void main(String[] args)
    {
        int arr[]={15,26,10,2,75,53};
        System.out.print("\nOriginal Array ::: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("\nAscending Order Array ::: ");
        for (int i : arr)
        {
            System.out.print(" "+i);
        }
    }
}