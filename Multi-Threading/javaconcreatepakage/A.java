import java.util.concurrent.locks.*;
import java.util.concurrent.*;
class A extends Thread
{
     static ReentrantLock l = new ReentrantLock();
     A(String name)
     {
          super(name);
     }
     public void run()
     { 
          try{
            // if(l.tryLock())
            if(l.tryLock(5000,TimeUnit.MILLISECONDS))
            {
                  System.out.println("Who got lock--------"+Thread.currentThread().getName());
                   try{  Thread.sleep(2000);  }
                  catch(InterruptedException e)
                   {}
               l.unlock();
           //    break();
            }
              
            
          else
          {
                System.out.println("perform alternate operation------"+Thread.currentThread().getName());
           }
             }
                    catch(InterruptedException e)
                     {}
        while(true);
      }  
}
class Demo1
{
     public static void main(String[] args)
     {
            A a =new A("Abhishek");
            A a1 = new A("Rahul");
            A a2 = new A("Deepak");     
            a.start();
            a1.start();
            a2.start();
       }
}
