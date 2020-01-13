import java.util.*;
class Arrayutilitydemo2
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
            System.out.println("------------------------------------------------------------------");   
           System.out.println(Arrays.binarySearch(i,9));
           System.out.println("------------------------------------------------------------------");   
           System.out.println(Arrays.binarySearch(i,4));
           System.out.println("------------------------------------------------------------------");   
           String[] s ={"A","B","G","D","R"};
           for(String s1:s)
           {
                System.out.print(s1);
           }
              System.out.println("");
          // Arrays.sort(s);    //for comparable D.N.S.................
              Arrays.sort(s,new Mycomparable2()); //for comparator C.S.O.................
            System.out.println(Arrays.binarySearch(s,"G"));//if you may use comparator then order of index should be unexpected of comparable.................
           System.out.println(Arrays.binarySearch(s,"C"));
            System.out.println(Arrays.binarySearch(s,"A",new Mycomparable2()));
           
           for(String s1:s)
           {
                System.out.print(s1);
           }  
     }
}
class Mycomparable2 implements Comparator
{
      public int compare(Object obj1,Object obj2)
      {
           String s1 = (String)obj1;
           String s2 = (String)obj2;
          return -s1.compareTo(s2);
      }
}