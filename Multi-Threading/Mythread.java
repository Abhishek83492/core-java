class Mythread extends Thread
{
      public void run()
      {
             for(int i = 0;i<10;i++)
             {
                  System.out.println("Hello");
             }
      }
}
class Threaddemo
{
    public static void main(String[] args)
     {
           Mythread m = new Mythread();
           m.start();
       
            for(int j=0; j<10;j++)
            {
                  System.out.println("hi");
            }
     }
}  