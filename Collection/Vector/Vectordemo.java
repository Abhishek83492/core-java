import java.util.*;
class Vectordemo
{
       public static void main(String[] args)
       {
          //   Vector v = new Vector();
             Vector v = new Vector(10,3);
              System.out.println(v.capacity());
             int i=0;
            while(i<=10)
            {
                   v.addElement(i);
                   i++;
             }
            System.out.println(v.capacity());
            v.addElement("A");
            System.out.println(v.capacity());
            System.out.println(v);
            Enumeration e = v.elements();
            while(e.hasMoreElements())
            {
              Object o = e.nextElement();
         //      Integer I = (Integer)e.nextElement();
         //     if(I%2==0)
         //     {
                   System.out.println(o);
         //    }
             }
          }  
        
}
    
          
             