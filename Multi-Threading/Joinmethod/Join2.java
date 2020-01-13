class Join1 extends Thread
{
    static Thread mt;
    public void run()
    {
        try{
              mt.join();
            }
        catch(InterruptedException e)
        {}
               for(int k=0;k<=10;k++)
               {
                      System.out.println("Child thread");
                    }
}
} 
class Join2
{
   public static void main(String[] args)throws InterruptedException
   {
       Join1.mt = Thread.currentThread();
       Join1 j = new Join1();
       j.start();
       for(int i=0;i<=10;i++)
       {
            System.out.println("main thread");
            Thread.sleep(2000);
       }
}
}
      
         