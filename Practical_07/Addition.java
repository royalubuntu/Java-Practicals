package Maths;
public class Addition
{
    public int add(int a, int b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        Addition a= new Addition();
        System.out.println("SUM == "+a.add(10,20));
    }
}

