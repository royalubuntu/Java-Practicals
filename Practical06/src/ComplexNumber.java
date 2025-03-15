public class ComplexNumber
{
double a,b;
ComplexNumber(double a,double b)
{
    this.a=a;
    this.b=b;
}
public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2)
{
    ComplexNumber temp = new ComplexNumber(0,0);
    temp.a=c1.a+c2.a;
    temp.b=c1.b+c2.b;
    return temp;
}

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(5.5,4.8);
        ComplexNumber c2 = new ComplexNumber(8.10,5.8);

        ComplexNumber temp = sum(c1,c2);
        System.out.println("Sum :: "+temp.a+temp.b);


    }
}
