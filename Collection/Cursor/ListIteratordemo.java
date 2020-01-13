import java.util.*;
class ListIteratordemo
{
    public static void main(String[] args)
    {
          LinkedList ll = new LinkedList();
          ll.add("MY");
          ll.add("NAME");
          ll.add("IS");
          ll.add("ABHISHEK");
          ll.add("GUPTA");
            System.out.println(ll);
          ListIterator itr = ll.listIterator();
          while(itr.hasNext());
          {
                String s = (String)itr.next();
           System.out.println(s);
           if(s.equals("MY"))
           {
                  itr.remove();
            }
            
            else if(s.equals("Name"))
            {
                   itr.add("name");
             }
            
            else if(s.equals("Abhishek"))
            {
                    itr.set("Abhishek");
            }
           
            System.out.println(s);
          }
      }
} 