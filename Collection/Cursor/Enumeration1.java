import java.util.*;
class Enumeration1
{
   public static void main(String[] args)
   {
          Vector al = new Vector();
          al.addElement("A");
          al.addElement("A");
          al.removeElement("A");
          al.removeElement("A");
           System.out.println(al);
          for(int i = 0 ;i<=10;i++)
          {
               al.addElement(i);
          }
         
          Enumeration e = al.elements();
          while(e.hasMoreElements())
          {
              Integer I = (Integer)e.nextElement(); //classcast Exception because String cannot be converted to integer.........
              if(I%2==0)
              {
                   System.out.println(I);
               }
             //   Object ob = e.nextElement();
           
          //  System.out.println(ob);
          }
           System.out.println(e.getClass().getName());
    }
} 