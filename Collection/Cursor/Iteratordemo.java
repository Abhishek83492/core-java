import java.util.*;
class Iteratordemo
{
   public static void main(String[] args)
   {
         ArrayList al = new ArrayList();
         al.add(100);
         al.add(15);
         al.add(65);
         for(int i = 0 ; i<=10;i++)
         {
              al.add(i);
         }
         System.out.println(al);
         Iterator itr = al.iterator();
         while(itr.hasNext())
         {
            Integer I = (Integer)itr.next();
            if(I%2==0)
            {
                    System.out.println(I);
            }
            else
            {
                   itr.remove();
            }
            
          //    Object o = itr.next();
          //   System.out.println(o);
         }
         System.out.println(itr.getClass().getName());
    }
} 