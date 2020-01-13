import java.util.concurrent.locks.*;
import java.util.concurrent.*;
class A1 extends Thread
{
     static ReentrantLock l = new ReentrantLock();
     A1(String name)
     {
          super(name);
     }
     public void run()
     {
         do{
               try{
                        if(l.tryLock(5000,TimeUnit.MILLISECONDS))
                         { 
                               System.out.println("Who got the lock--------"+Thread.currentThread().getName());
                               try{ Thread.sleep(10000); }
                                catch(InterruptedException e)
                                 {}
                               System.out.println("Releases the lock-------"+Thread.currentThread().getName());
                              l.unlock();
                             break;
                          }
                       else
                      {
                          System.out.println("I couldnot get the lock but i will try---------"+Thread.currentThread().getName());
                      }
                       }
                       catch(InterruptedException e)
                    {}
             }while(true); 
           
           
      }  
}
class Demo2
{
     public static void main(String[] args)
     {
            A1 a =new A1("Abhishek");
            A1 a1 = new A1("Rahul");
            A1 a2 = new A1("Deepak");     
      a.start();
      a1.start();
      a2.start();
     }
}