import java.util.*;

class Vehicle
{
    int maxSpeed = 120;
}
class Car extends Vehicle
{
    int maxSpeed = 150;
    void show()
    {
        System.out.println("Max Speed of Car is : "+maxSpeed+"\nMax Speed of Vehicle is : "+super.maxSpeed);
    }

}


public class SingleInherit
{
    public static void main(String[] args) {
        Car c = new Car();
        c.show();

    }
}
