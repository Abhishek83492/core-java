import java.util.*;
class Priorityqueuedemo2
{
    public static void main(String[] args)
    {
          PriorityQueue p = new PriorityQueue(15,new Mycomparable());
          p.offer("Abhishek");
          p.offer("Aman");
          p.offer("Harash");
          p.offer("jacky");
          System.out.println(p);
    }
}
class Mycomparable implements Comparator
{
       public int compare(Object obj1,Object obj2)
       {
            String s1= (String)obj1;
            String s2= (String)obj2;
             return  -s1.compareTo(s2);
       }
        
}