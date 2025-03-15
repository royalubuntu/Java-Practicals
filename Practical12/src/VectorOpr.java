//2. DAP to Create A vector with 7 Elements as(10,30,50,20,40,10,20)
// remove elements at 3, 4 position insert new element at 3 postion &
// finally display original size & Capacity with capacity.

import java.util.*;
public class VectorOpr

{
    public static void main(String[] args) {
    Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(30);
        v.add(50);
        v.add(40);
        v.add(10);
        v.add(20);
        System.out.println("Original Size :: "+v.size());
        System.out.println("Original Capacity :: "+v.capacity());
        System.out.println("===========================================================");
        System.out.println("Vector Elements are :: ");
        System.out.println(v);
        v.remove(3);
        v.remove(4);
        System.out.println("===========================================================");
        System.out.println("After Removing Elements :: ");
        System.out.println("Vector Elements are :: ");
        System.out.println(v);
        System.out.println("After Inserting new Element at 3 :: ");
        v.add(3,100);
        System.out.println(v);
        System.out.println("Current Size :: "+v.size());
        System.out.println("Current Capacity :: "+v.capacity());




    }
}
