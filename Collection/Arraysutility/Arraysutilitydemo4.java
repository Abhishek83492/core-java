import java.util.*;
class Arraysutilitydemo4
{
    public static void main(String[] args)
    {
          String[] s2= {"A","M","T"};
          List l = Arrays.asList(s2);
        //  System.out.println(l);
          s2[0]="R";
        //  System.out.println(l);
          l.set(1,"L");
         // System.out.println(l);
          for(String[] s1: s2)
          {
             System.out.println(s1);
          }
          //l.add("Abhishek");   //unsupported operation exception..........................
          //l.remove(2);              //unsupported operation exception..........................
         //l.add(new Integer(10));   //Array store Exception...............
          
    }
}