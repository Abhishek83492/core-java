import java.util.*;
class WeakHashmapdemo
{
      public static void main(String[] args)throws InterruptedException
      {
            WeakHashMap h = new WeakHashMap();
            Temp t = new Temp();
            h.put(t,"Abhishek");
            System.out.println(h);
            t=null;
            Thread.sleep(5000);
            System.gc();
            System.out.println(h);
            System.out.println(h.hashCode());
      }
}
class Temp
{
      public String toString()
      {
            return "Name is";
      }
      public int hashCode()
      {
           return 15478;
      }
      public void finalize()
      {
            System.out.println("i am destroyed by gc");
      }
}
   
       
      