import java.util.*;
class Arraylistdemo
{
     public static void main(String[] args)
     {
          ArrayList a = new ArrayList(); 
           a.add(56);
           a.add(500);
           a.add(98);
           a.add(1);
           a.add(92540);
          System.out.println(a);
           Collections.sort(a); //to sort of list objects by D.N.S.O..............
       //   Collections.sort(a,new Mycomparable());  //to sort of list objects by C.S.O..............
      //    int i = Collections.binarySearch(a,1,new Mycomparable());  //to search of list objects ............
          int i1 = Collections.binarySearch(a,55,new Mycomparable());  
       //   System.out.println(i);
        //  System.out.println(i1);
      //    Collections.reverse(a);  //to reverse of list objects by this method.................
          System.out.println(a);
          System.out.println(i1); 
     }
}
class Mycomparable implements Comparator
{
     public int compare(Object obj1,Object obj2)
     {
            Integer i1 = (Integer)obj1;
            Integer i2 = (Integer)obj2;
            return i2.compareTo(i1);
      }
}                      