class Display extends Thread
{
       int total=0;
       int total1=0;
       public void run()
       {
           synchronized(this){
              System.out.println("Child thread start calculation............");
            
              for(int i=0;i<=10;i++)
              {
                    total=total+i;
                  }
              System.out.println("Child thread complete execution and releases lock...................");
              this.notify();
          }
         for(int j=0;j<=16;j++)
              {
                    total1=total1+j;
                  }
       }
}
class Demo
{
       public static void main(String[] args)throws InterruptedException
       {
            Display d = new Display();
            d.start();
           Thread.sleep(2000);       
            synchronized(d){    
          System.out.println("Main thread waiting for child thread complition.............");
             d.wait(2000);
      //      Thread.sleep(2000);       //if you want to wait for child thread compliting his execution..................
          System.out.println("Main thread get the lock");
            System.out.println(d.total);
            
            System.out.println(d.total1);
         } 
       }
} 