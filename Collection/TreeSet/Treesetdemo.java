import java.util.*;
class Treesetdemo
{
      public static void main(String[] args)
      {
           TreeSet t = new TreeSet();
            t.add("R");
            t.add("A");
            t.add("T");
            t.add("R");
            t.add("D");
         //   t.add(null);      //------null pointer exception---------
         //   t.add(new Integer(10));  //-------classcastException-----------
            System.out.println("Default natural sorting order:"+t);
       }
}