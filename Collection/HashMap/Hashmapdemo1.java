import java.util.*;
class Hashmapdemo1
{
     public static void main(String[] args)
     {
           HashMap h = new HashMap();
           Integer i1= new Integer(10);
           Integer i2= new Integer(10);
           h.put(i1,"Abhishek");
           h.put(i2,"abhishek");
           System.out.println(h);
           System.out.println(i1.equals(i2));
     }
}