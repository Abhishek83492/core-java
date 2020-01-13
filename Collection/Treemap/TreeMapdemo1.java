import java.util.*;
class TreeMapdemo1
{
      public static void main(String[] args)
      {
           TreeMap t = new TreeMap(new Mycomparable());
           t.put("Abhishek",100);
           t.put("harash",130);
           t.put("java",188);
           t.put("python",105);
           t.put("Ac",165);
           t.put("comp",1041);
           System.out.println(t);
      }
}
class Mycomparable implements Comparator
{
      public int compare(Object obj1,Object obj2)
      {
               String s1=obj1.toString();
               String s2 =obj2.toString();
               return s2.compareTo(s1);
       }
}