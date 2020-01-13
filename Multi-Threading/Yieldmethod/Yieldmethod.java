class Yieldmethod extends Thread  //doesnt support in all os.......................
{
       public void run()
       {
              for(int i=0;i<=10;i++)
              {
                   System.out.println("child method");
                   Thread.yield(); //after adding yield method child class will be pause for giving chance to other same priority
                                            //       thread.........
              }
       }
}
class Yieldmethod2 extends Thread
{
       public void run()
       {
              for(int i=0;i<=10;i++)
              {
                   System.out.println("child second method");
                 //  Thread.yield(); 
              }
       }
}
class Yieldtest
{
      public static void main(String[] args)
      {
           Yieldmethod y = new Yieldmethod();
           y.start();
           Yieldmethod2 y2 = new Yieldmethod2();
           y2.start();
           for(int i =0;i<=10;i++)
           {
                   System.out.println("main method");
           }
      }
}     