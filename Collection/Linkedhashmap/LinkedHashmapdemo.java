import java.util.*;
class LinkedHashmapdemo
{
     public static void main(String[] args)
     {
          LinkedHashMap h =  new LinkedHashMap(15,0.9f);
          h.put("Abhishek",100);
          h.put("Deepak",101);
          h.put("Arpan",102);
          h.put("Avinash",103);
          h.put("Aakash",104);
          System.out.println(h);
          System.out.println(h.put("Abhishek",5000));
          System.out.println(h);
          Set s = h.keySet();
          System.out.println(s); //in collection set interface format[............]
          Collection c = h.values();
          System.out.println(c); //in collection set interface format[............]
          Set s1 = h.entrySet();
          System.out.println(s1);//in collection set interface format[............]
          Iterator itr = s1.iterator();
          while(itr.hasNext())
          {
                Map.Entry m1 = (Map.Entry)itr.next();
                System.out.println(m1.getKey()+"-------------"+m1.getValue());
                
                if(m1.getKey().equals("Aakash"))
                {
                        m1.setValue(4545);
                }
          }
               System.out.println(h);
           
      }
}