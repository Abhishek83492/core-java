import java.util.concurrent.*;
class Printjob implements Runnable
{
        String name;
        Printjob(String name)
         {
             this.name=name;
          }
         public void run()
         {
                System.out.println("------------------------------------------------------------------------------------------------");
                System.out.println(name+":----Job started by---"+Thread.currentThread().getName());
                try{  Thread.sleep(5000); }
                catch(InterruptedException e)
                {}
                System.out.println("------------------------------------------------------------------------------------------------");
                System.out.println(name+":---Job END by---"+Thread.currentThread().getName());
                System.out.println("------------------------------------------------------------------------------------------------"); 
         }
}
class Print
{
      public static void main(String[] args)
      {
           Printjob[] jobs ={ new Printjob("Abhishek"),
                                     new Printjob("Rahul"),
                                     new Printjob("Aakash"),
                                     new Printjob("Amit"),
                                     new Printjob("Arpan"),
                                     new Printjob("Awal")};
          ExecutorService service = Executors.newFixedThreadPool(4);
          for(Printjob job1 : jobs)
           {
                service.submit(job1);
           }
             service.shutdown();
       }
}  