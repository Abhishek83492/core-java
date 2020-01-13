import java.util.*;
class Comparatordemo1
{
     public static void main(String[] args)
     {
          TreeSet t = new TreeSet(new Mycomparator1());
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
class Mycomparator1 implements Comparator
{
     public  int compare(Object obj1,Object obj2)
     {
            Integer I1 = (Integer)obj1;
            Integer I2 = (Integer)obj2;
            
          //  return I1.compareTo(I2);//----------result in ascending order--------------
            return -I1.compareTo(I2);//------------result in descending order-----------
          //  return I2.compareTo(I1); //--------------result in descending order------------  
          //  return -I2.compareTo(I1); //------------result in ascending order-----------     
           return +1; //-------------get insertion order with duplicate-----------------no typecasting required--------------
          //  return -1; //------------get reverse of insertion order with duplicate-----------------------
          //  return 0;  //-------------get first element only and other is cosidered as duplicate-------------------

}
1}                 