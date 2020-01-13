class Display
{
    public void displayn()
    {
           for(int j=0;j<=10;j++)
          {
               System.out.println("Number");
                 try{
                           Thread.sleep(2000);
                    }
               catch(InterruptedException e)
               {}
          }
        synchronized(Display.class){       //synchronized block to get class level lock.....................
         for(int i=0;i<=10;i++)
         {
                System.out.println(i);
                try{
                           Thread.sleep(2000);
                    }
               catch(InterruptedException e)
               {}
         }
       }
     }
    public void displayc()
    {
           for(int j=0;j<=10;j++)
          {
               System.out.println("Character");
                  try{
                           Thread.sleep(2000);
                    }
               catch(InterruptedException e)
               {}
          }
         synchronized(this){              // synchronized block to get object level lock.....................
         for(int i=65;i<=75;i++)
         {
                System.out.println((char)i);
                try{
                           Thread.sleep(2000);
                    }
               catch(InterruptedException e)
               {}
         }
      }
     }
}
class Mythread extends Thread
{
    Display d;
    Mythread(Display d)
    {
         this.d=d;
    }
    public void run()
    {
         d.displayn();
    }
}
class Mythread1 extends Thread
{
    Display d;
    Mythread1(Display d)
    {
         this.d=d;
    }
    public void run()
    {
         d.displayc();
    }
}
class Synchdemo
{
    public static void main(String[] args)
    {
          Display d = new Display();
          Mythread m = new Mythread(d);
          Mythread1 m1 =new Mythread1(d);
          m.start();
          m1.start();
     }
}  