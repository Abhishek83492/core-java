import java.util.*;
class Arraylist
{
       public static void main(String[] args)
       {
              ArrayList al = new ArrayList();
              al.add("A");
              al.add("null");
              al.add(10);
              al.add(true);
              al.add("A");
              System.out.println(al);
              al.remove(1);
              System.out.println(al);
              al.add(2,false);
              al.add("C");
              System.out.println(al);
              System.out.println(al.set(3,"G"));
              System.out.println( al.indexOf("A"));
             // System.out.println( al.lastindexOf("A"));
             System.out.println(al);
             al.clear();
             System.out.println(al);
             System.out.println(al.contains("A"));
               System.out.println(al.isEmpty());
             al.add("A");
              al.add("null");
              al.add(10);
              al.add(true);
              al.add("A");
             Object[] i = al.toArray();
             for(Object i2: i)
            {
                   System.out.println("retriving="+i2);
           }

             
        }
}
       