class Priority extends Thread
{
   public void run()
   {
        System.out.println("child method");
   }
}
class Priority2 extends Thread
{
      public void run()
   {
        System.out.println("Second child method");
   }
}
class Priority3 extends Thread
{
      public void run()
   {
        System.out.println("Third child method");
   }
}
   
class Priority1
{
    public static void main(String[] args)
    {
         Thread.currentThread().setName("my");
         System.out.println(Thread.currentThread().getName());
         Priority p = new Priority();
         Priority3 p3 = new Priority3();
         Thread.currentThread().setName("its my");
         System.out.println(Thread.currentThread().getName());
         System.out.println(p3.getName());
         Priority2 p2 = new Priority2();
         p2.start();
         p.start();
         p3.start();
         p2.setPriority(8);
         p2.getPriority();
         Thread.currentThread().setName("my");
        System.out.println( p2.getName());
        System.out.println( p.getName());
        System.out.println( p3.getName());
         
         System.out.println("main method");
    }
}   
