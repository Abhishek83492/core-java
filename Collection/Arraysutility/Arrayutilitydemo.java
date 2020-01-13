import java.util.*;
class Arrayutilitydemo
{
     public static void main(String[] args)
     {
           int[] i = {1,5,9,2,3};
           for(int i1 : i)
           {
               System.out.print(i1);
              
           }
              System.out.println("");
           Arrays.sort(i);
           for(int i1 : i)
           {
               System.out.print(i1);
            }
             System.out.println("");
           System.out.println("------------------------------------------------------------------");   
           String[] s ={"A","B","G","D","R"};
           for(String s1:s)
           {
                System.out.print(s1);
           }
              System.out.println("");
         //  Arrays.sort(s);
           Arrays.sort(s,new Mycomparable());
           for(String s1:s)
           {
                System.out.print(s1);
           }  
     }
}
class Mycomparable implements Comparator
{
      public int compare(Object obj1,Object obj2)
      {
           String s1 = (String)obj1;
           String s2 = (String)obj2;
          return -s1.compareTo(s2);
      }
}