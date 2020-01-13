class Customer extends Thread
{
      static Integer cusid = 0;
      private static ThreadLocal tl = new ThreadLocal()
      {
              protected Integer initialValue()
              {
                    return ++cusid;
              }
      };
      Customer(String name)
      {
             super(name);
      }
      public void run()
      {
         System.out.println(Thread.currentThread().getName()+"-------------"+tl.get());
      }
}
class Customer2 
{
      public static void main(String[] args)
      {
          Customer c = new Customer("Thread 1");
          Customer c1 = new Customer("Thread 2");
          Customer c2= new Customer("Thread 3");
          Customer c3 = new Customer("Thread 4");
          Customer c4 = new Customer("Thread 5");
        
         c.start();
         c1.start();
         c2.start();
         c3.start();
         c4.start();
 
     }
}                    