import java.util.*;
class Hashtabledemo
{
       public static void main(String[] args)
       {
            Hashtable t = new Hashtable();
            t.put("new Temp(5)",500);
            t.put("new Temp(10)",5);
            t.put("new Temp(69)",652);
            t.put("new Temp(48)",895);
            t.put("new Temp(84)",5000);
            t.put("new Temp(102)",986);
            t.put("new Temp(65)",100);
            t.put("new Temp(55)",985);
            t.put("new Temp(57)","Abhishek");
            System.out.println(t);
       }
}
class Temp
{
    int i;
    Temp(int i)
     {
          this.i=i;
     }
     public int hashCode()
     {
          return i;
      }
     public String toString()
     {
         return i+"  ";
     }
}
       