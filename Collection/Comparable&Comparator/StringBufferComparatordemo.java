import java.util.*;
class StringBufferComparatordemo
{
     public static void main(String[] args)
     {
          TreeSet t = new TreeSet(new Mycomparator3());
          t.add(new StringBuffer ("Abhishek"));
          t.add(new StringBuffer ("Gupta"));
          t.add(new StringBuffer ("Amaan"));
          t.add(new StringBuffer ("Malik"));
          t.add(new StringBuffer ("Java"));
          t.add(new StringBuffer ("c"));
          t.add(new StringBuffer ("Cplus"));
          t.add(new StringBuffer ("Python"));
          System.out.println(t);
     }
}
class Mycomparator3 implements Comparator
{
     public  int compare(Object obj1,Object obj2)
     {
          String s1 = obj1.toString();
          String s2 = obj2.toString();
           return s1.compareTo(s2);          
      //in string buffer comparable is not implemented so you may use sorting by declaring comparator----------------------   
     }
}                 