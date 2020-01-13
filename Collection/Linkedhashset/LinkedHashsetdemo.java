import java.util.*;
class LinkedHashsetdemo
{
    public static void main(String[] args)
    {
          LinkedHashSet hs = new LinkedHashSet(17,0.75f);
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
          