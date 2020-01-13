class Joinmethod extends Thread 
{
       public void run()
       {
              for(int i=0;i<=10;i++)
              {
                   System.out.println("child method");
                    try{
                                Thread.sleep(2000);
                         }
                    catch(InterruptedException c)
                    {
                         }
                  //   y2.join();
                                           
              }
       }
}
/*class Joinmethod2 extends Thread
{
       public void run()
       {
              for(int i=0;i<=10;i++)
              {
                   System.out.println("child second method");
                                                         
              }
       }
}*/
class Yieldtest
{
      public static void main(String[] args)throws InterruptedException  
      {
           Joinmethod y = new Joinmethod();
           y.start();
         //   y.join();
           y.join(10000);
        //   y.join(2000,2000);
        //  Joinmethod2  y2 = new Joinmethod2 ();
        //   y2.start();
           for(int i =0;i<=10;i++)
           {
                   System.out.println("main method");
           }
      }
}     