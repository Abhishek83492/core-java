import java.util.*;
class Genericsdemo
{
       public static void main(String[] args)
       {
          //    Collection<String> l = new ArrayList<String>();
          //   List<String> l = new ArrayList<String>();
          //   ArrayList<String> l = new ArrayList<String>();  //polymorphism concept only applicable for base type not for parameter type..................
             l.add("Abhishek");
             l.add("Gupta");
          //   l.add(new Integer(15));
          //   System.out.println(l);
            String s1 = l.get(1);
            System.out.println(s1);
        }
}