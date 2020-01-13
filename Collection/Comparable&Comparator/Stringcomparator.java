import java.util.*;
class Stringcomparator
{
    public static void main(String[] args)
    {
          TreeSet ts = new TreeSet(new Mycomparator2());
           ts.add("Abhishek");
           ts.add("abhishek");
           ts.add("Gupta");
           ts.add("gupta");
           ts.add("Deepak");
           ts.add("Akash");
           ts.add("Python");
           ts.add("Java");
           System.out.println(ts);
     }
} 
class Mycomparator2 implements Comparator
{
     public int compare(Object obj1,Object obj2)
     {
          String s1 =(String)obj1;
          String s2 =(String)obj2;
        
          return -s1.compareTo(s2);
       //same as Integer compare in previous program all comparision is same-----------------------------
     }
}