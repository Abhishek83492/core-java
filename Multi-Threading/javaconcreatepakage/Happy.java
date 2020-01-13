import java.util.concurrent.locks.*;
class Happy
{
      ReentrantLock l = new ReentrantLock();
      public void wish(String name)
       {
          l.lock();
              for(int i=0;i<=10;i++)
              {
                     System.out.print("I  am Happy");
                     try{
                             Thread.sleep(2000);
                         }
                     catch(InterruptedException e)
                     {}
           System.out.println(name);
         }
         l.unlock();
}
}
class Mythread extends Thread
{
        Happy h;
        String name;
        Mythread(Happy h,String name)
        {
             this.h=h;
             this.name=name;
        }
          public void run()
          {
              h.wish(name);
          }
}
 class Demo
 {
        public static void main(String[] args)
        {
             Happy h = new Happy();
             Mythread m = new Mythread(h,"Abhishek");
             Mythread m1 = new Mythread(h,"Gupta");
             m.start();
             m1.start();
         }
}
                        
 