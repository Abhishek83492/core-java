import java.util.concurrent.*;
class Printjob2 implements Callable
{
       int num;
       Printjob2(int num)
        {
            this.num=num;
        }
        public Object call()throws Exception
        {
               System.out.println(Thread.currentThread().getName()+"is responsible to print sum of first--"+num+"--numbers");
               int sum = 0;
               for(int i=0;i<=num;i++)
               {
                       sum=sum+i;
               }
              return sum;
          }
}
class Call
{
     public static void main(String[] args)throws  Exception
     {
           Printjob2[] p ={ new Printjob2(10),
                                  new Printjob2(20),
                                  new Printjob2(30),
                                  new Printjob2(40),
                                  new Printjob2(50),
                                  new Printjob2(60),
                                  new Printjob2(70),
                                  new Printjob2(80)};
         ExecutorService service = Executors.newFixedThreadPool(1);
         for(Printjob2  e: p)
         {
           Future d= service.submit(e);
            Thread.sleep(2000);
           System.out.println(d.get());
         }
          service.shutdown();
     }
}
          
