class Mythread extends Thread
{
     public void run()
     {
          for(int i=0;i<=10;i++)
          {
         System.out.println("i am run()");
          try{  Thread.sleep(2000);}
         catch(InterruptedException e)
          {}
     }
 }
}
class Daemon
{
      public static void main(String[] args)
      {
          System.out.println(Thread.currentThread().isDaemon());
       //   Thread.currentThread().setDaemon(true); // illegalthreadstateException..............
       //    System.out.println(Thread.currentThread().isDaemon());
           Mythread m = new Mythread();
           System.out.println( m.isDaemon());
      //     m.setDaemon(true);
      //     System.out.println( m.isDaemon());
           m.start();  //after complition of main thred execution all daemon thread terminated irrespective of their position..........
     }
}