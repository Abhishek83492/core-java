import java.util.*;
class Stackdemo
{
    public static void main(String[] args)
    {
         Stack   s = new Stack();
         System.out.println(s.capacity());
         s.push("A");
         s.push("B");
         s.push("C");
         s.push("D");
         
         s.push("A");
         s.push("B");
         s.push("C");
         s.push("D");
         
         s.push("A");
         s.push("B");
         s.push("C");
         s.push("D");
         System.out.println(s.peek());
         System.out.println(s.pop());
         System.out.println(s);
         System.out.println(s.search("A"));
         System.out.println(s.search("C"));
         System.out.println(s.capacity());
    }
} 
         