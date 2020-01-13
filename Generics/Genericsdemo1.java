import java.util.*;
class Gen<T>
{
       T obj;
        Gen(T obj)
        {
            this.obj=obj;
        }
       public void show()
       {
            System.out.println("Class of this object--------"+obj.getClass().getName());
       }
        public T get()
        {
              return obj;
        }
}
class Genericsdemo1
{
       public static void main(String[] args)
       {
           Gen<String> t =new Gen<String>("Abhishek");
           t.show();
           System.out.println(t.get());
           System.out.println("-------------------------------------------------------");
 
            Gen<Integer> t1 =new Gen<Integer>(100);
           t1.show();
           System.out.println(t1.get());
           System.out.println("-------------------------------------------------------");                               
      
            Gen<Double> t2 =new Gen<Double>(10.6);
           t2.show();
           System.out.println(t2.get());
           System.out.println("-------------------------------------------------------");                               
        }
}