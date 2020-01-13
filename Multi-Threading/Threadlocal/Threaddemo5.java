class ParentThread extends Thread
{
   //   static ThreadLocal tl = new ThreadLocal();
       static InheritableThreadLocal tl = new InheritableThreadLocal()  //to provide same set value to all the threads............
       {
       public Object childValue(Object p)
       {
            return "Gupta";
       }
       };
       public void run()
       {
            tl.set("Abhishek");
            System.out.println("Parent thread value--------"+tl.get());
            ChildThread ch = new ChildThread();
            ch.start();
       }
}
class ChildThread extends Thread
{
       public void run()
       {
       System.out.println("Child thread value----------"+ParentThread.tl.get());
       }
}
class Threaddemo5
{
     public static void main(String[] args)
     {
           ParentThread pt = new ParentThread();
           pt.start();
     }
}
            
       