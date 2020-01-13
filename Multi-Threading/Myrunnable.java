class Myrunnable implements Runnable
{
    public void run()
    {
      for(int i=0;i<10;i++)
        {
          System.out.println("child method");
         }
     }
}
class Myrunnable1
{
   public static void main(String[] args)
   {
       Myrunnable  my  = new Myrunnable();
      Thread t = new Thread(my);
       t.start();
       for(int j = 0 ;j<10;j++);
       {
          System.out.println("main method");
       }
    }
}
       
         