import java.lang.reflect.*;
class MyGetClass
{
    static  int count = 0,count1=0;
   int i;
   String name;
   double sno;
  
   MyGetClass()
   {
   }
   MyGetClass(int i, String name,double sno)
   {
          this.i=i;
          this.name=name;
          this.sno=sno;
   }
   void information()
   {
       System.out.println("variable is"+i);
       System.out.println("Name is"+name);
       System.out.println("Serial number is"+sno);
   }
   void Inform()
   {
        System.out.println("----------------------the end---------------------------");
   }
public static void main(String[] args)
{
   Object m = new MyGetClass(100,"Abhishek",1025647.25);
   Class c = m.getClass();
  System.out.println("-----------------------------------------------------------------");
  System.out.println("Name of class is:-"+c.getName());
  Method m2[] = c.getDeclaredMethods();
  Constructor d[] = c.getDeclaredConstructors();
   System.out.println("-----------------------------------------------------------------");
   System.out.println("methods information");
  for(Method m1: m2)
  {
      count++;
       System.out.println(m1.getName());
  }
  System.out.println("-----------------------------------------------------------------");
  System.out.println("The number of methods used are:"+count);
  System.out.println("-----------------------------------------------------------------");




  
  System.out.println("-----------------------------------------------------------------");
  System.out.println("Constructor Information");
  for(Constructor d1:d)
  {
        count1++;
        System.out.println(d1.getName());
  }
  System.out.println("-----------------------------------------------------------------");
  System.out.println("The number of consturctors used are:"+count1);
  System.out.println("-----------------------------------------------------------------");
  
            
  
}
}

   