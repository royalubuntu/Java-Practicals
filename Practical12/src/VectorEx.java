//1. DAP to create A vector with 5 elements as (30,60,90,100,120) display size & Capacity
import java.util.*;
public class VectorEx
{
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(30);
        v.add(60);
        v.add(90);
        v.add(100);
        v.add(120);

        System.out.println(v);
        System.out.println("Size of Vector :: "+v.size());
        System.out.println("Capacity of Vector :: "+v.capacity());

    }
}
