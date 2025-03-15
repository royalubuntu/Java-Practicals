//import java.awt.*;

class Shape
{
    int calculateArea()
    {
        return 0;
    }
}
class Circle extends Shape
{
    float pi = 3.14f;
    double radius;
    Circle(double radius)
    {
        this.radius = radius;
    }
    int calculateArea()
    {
        double area = pi*radius*radius;
        System.out.println("Area of Circle :: "+area);
        return 0;
    }
}
class Rectangle extends Shape
{
    double length,width;
    Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    int calculateArea()
    {
        double area = length * width;
        System.out.println("Area of Rectangle :: "+area);
        return 0;
    }
}

class Traingle extends Shape
{
    double base,height;
    Traingle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }
    int calculateArea()
    {
        double area = 0.5 * base * height;
        System.out.println("Area of Trinagle =  "+area);
        return 0;
    }
}
public class Area
{
    public static void main(String[] args) {
//Shape s = new Shape();
    Shape circle = new Circle(3);
    Shape rectangle = new Rectangle(3,4);
    Shape triangle = new Traingle(3,4);

    circle.calculateArea();
    rectangle.calculateArea();
    triangle.calculateArea();
    }
}
