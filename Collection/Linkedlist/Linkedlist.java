import java.util.*;
class Linkedlist
{
     public static void main(String[] args)
     {
          LinkedList l = new LinkedList();
          {
               l.add("Abhishek");
               l.add(100);
               l.add(null);
               l.add("Abhishek");
               System.out.println(l);
               l.set(0,"Gupta");
               System.out.println(l);
               l.add(3,"Kumar");
               System.out.println("Removed last"+l.removeLast());
               l.addFirst("Prestige");
              System.out.println(l);
        }
   }
}