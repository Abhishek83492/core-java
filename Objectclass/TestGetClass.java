import java.lang.reflect.*;
class TestGetClass
{
   public static void main(String[] args)
   {
        int count =0;
        Object o = new String("Abhishek");
        Class c = o.getClass();
        System.out.println("Name of class"+c.getName());
        Method m[] = c.getDeclaredMethods();
        System.out.println("Methods information");
        for(Method m1: m)
        {
                count++;
                System.out.println(m1.getName());
        }
        System.out.println("The number of methods used are:"+count);
    }
}   