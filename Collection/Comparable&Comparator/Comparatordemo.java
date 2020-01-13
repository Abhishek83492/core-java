import java.util.*;
class Comparatordemo
{
     public static void main(String[] args)
     {
          TreeSet t = new TreeSet(new Mycomparator());
          t.add(0);
          t.add(15);
          t.add(5);
          t.add(10);
          t.add(20);
          t.add(3);
          t.add(98);
          t.add(45);
          System.out.println(t);
     }
}
class Mycomparator implements Comparator
{
     public  int compare(Object obj1,Object obj2)
     {
            Integer I1 = (Integer)obj1;
            Integer I2 = (Integer)obj2;
          
           if(I1 > I2)
           {
                 return -1;
           }
           else if(I1 < I2)
           {
                  return +1;
           }
           else
           {
                  return 0;
            }
     }
}                 