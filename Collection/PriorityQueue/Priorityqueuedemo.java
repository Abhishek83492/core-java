import java.util.*;
class Priorityqueuedemo
{
    public static void main(String[] args)
    {
         PriorityQueue p = new PriorityQueue(); //--------some platforms doesnt support priorityQueue concept-----------
         System.out.println(p.peek());
       //  System.out.println(p.element());  //------------no such element Exception-----------
         for(int i = 0 ; i<=10;i++)
         {
                 p.offer(i);
          }
          System.out.println(p);
          System.out.println(p.poll());
           System.out.println(p);
    }
}  
