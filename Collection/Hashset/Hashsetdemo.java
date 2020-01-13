import java.util.*;
class Hashsetdemo
{
    public static void main(String[] args)
    {
          HashSet hs = new HashSet(17,0.75f);
          hs.add("A");
          hs.add("B");
          hs.add(10);
          hs.add(true);
          hs.add(null);
          hs.add(20);
          hs.add(30);
          hs.add("T");
          System.out.println("After adding duplicate"+hs.add("A"));
          System.out.println(hs);
     }
} 
          