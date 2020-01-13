class Run extends Thread
{
     public void start()
     {
             super.start();
             System.out.println("start method");
      }
     public void run()
      {
              System.out.println("child method");
       }
}
class Run1
{
     public static void main(String[] args)
     {
              Run r = new Run();
               r.start();
               System.out.println("main method");
      }
}		