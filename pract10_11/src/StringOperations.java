class StringOperations
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Hello"); System.out.println("Original String : "+sb); System.out.println("\n\t1. Append "); sb.append(" World!"); System.out.println("\n\tAfter append: " + sb); System.out.println("\n\t2. Insert "); sb.insert(5, " Java"); System.out.println("\n\tAfter insert: " + sb); System.out.println("\n\t3. Capacity ");
        System.out.println("\n\tCapacity: " + sb.capacity());
        System.out.println("\n\t4. delete "); sb.delete(5, 10); System.out.println("\n\tAfter delete: " + sb); System.out.println("\n\t5. setCharAt"); sb.setCharAt(0, 'h');
        System.out.println("\n\tAfter setCharAt: " + sb);
    }
}
