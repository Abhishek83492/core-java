import java.util.*;
class Identityhashmap
{
    public static void main(String[] args)
    {
           IdentityHashMap i = new IdentityHashMap();
           Integer i1 = new Integer(10);
           Integer i2 = new Integer(10);
           i.put(i1,"Abhishek");
           i.put(i2,"Gupta");
           System.out.println(i);
           System.out.println(i1==i2);
      }
}