public class Ascending
{
    public static void main(String[] args) {
        int a[] = {20,10,40,50,12,80,90};
        int temp,i,j;
        for(i=0;i<a.length-1;i++)
        {
            for (j=0;j<a.length-1;j++)
            {
                if(a[i]<a[j+1])
                {
                    temp = a[i];
                    a[i]=a[j];
                    a[j+1]= temp;
                }

            }
        }
        for(int num:a)
        {
            System.out.println(num);
        }


    }
}
