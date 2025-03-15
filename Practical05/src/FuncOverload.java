public class FuncOverload
{
    int multiply(int a, int b)
    {
        return a*b;
    }
    int multiply(int a, int b, int c)
    {
        return a*b*c;
    }

    public static void main(String[] args) {
        FuncOverload f = new FuncOverload();
        System.out.println("Multiplication of 2 Numbers :: "+(f.multiply(2,3)));
        System.out.println("Multiplication of 3 Numbers :: "+(f.multiply(2,3,4)));

    }
}

