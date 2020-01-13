import java.util.*;
class LengthComparatordemo
{
     public static void main(String[] args)
     {
          TreeSet ts = new TreeSet(new Mycomparator4());
          
           ts.add("AA");
           ts.add("AAA");
           ts.add(new StringBuffer("ABD"));
           ts.add("AAAA");
           ts.add("BB");
           ts.add(new StringBuffer("BBBB"));
           ts.add("DBA");
           ts.add("DDDD");
           System.out.println(ts);
     }
}
class Mycomparator4 implements Comparator
{
     public  int compare(Object obj1,Object obj2)
     {
          String s1 =obj1.toString();
          String s2 =obj2.toString();
          int l1=s1.length();
          int l2=s2.length();
          if(l1 > l2)
          {
               return +1;
          }
          else if(l1 < l2)
          {
               return -1;
          }
          else
          {
             return s1.compareTo(s2);
          }
     }
}                 