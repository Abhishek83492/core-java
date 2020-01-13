class Mythread extends Thread
{
       public void run()
       { 
         System.out.println("my thread");
       }
}
class Demo
{
     public static void  main(String[] args)
     {
           System.out.println("----------------------------------------------------------------------------------");
           System.out.println("main thread belongs to="+Thread.currentThread().getThreadGroup().getName());
           System.out.println("main thread parent thread is="+Thread.currentThread().getThreadGroup().getParent().getName());
           System.out.println("----------------------------------------------------------------------------------");
           ThreadGroup g = new ThreadGroup("Mythread1");
           ThreadGroup g1 = new ThreadGroup(g,"Mythread2");
           System.out.println("ThreadGroup belongs to="+g1.getName());
           System.out.println("ThreadGroup parent group is ="+g1.getParent().getName());
           Thread t1 = new Thread(g,"Thread1");
           Thread t2 = new Thread(g,"Thread2");
           g.setMaxPriority(3);
           Thread t3 = new Thread(g,"Thread3");
           t1.start();
           t2.start();
           t3.start();
           System.out.println("----------------------------------------------------------------------------------");
         /*  Thread[ ]  t = new Thread[10];
             g.enumerate(t);
            System.out.println("All threads present in G group");
             for(Thread t4 : t)
             {
                  System.out.println(t4.getName());
              }*/
           System.out.println("----------------------------------------------------------------------------------");
           System.out.println("ThreadGroup g is:"+g.activeCount());
           System.out.println("ThreadGroup g1 is:"+g1.activeCount());
           System.out.println("ThreadGroup g is:"+g.activeGroupCount());
           System.out.println("ThreadGroup g1 is:"+g1.activeGroupCount()); 
           System.out.println("----------------------------------------------------------------------------------");
           System.out.println("Information about the groups");
           g.list();
           System.out.println("----------------------------------------------------------------------------------");
           System.out.println("Priority of first thread is:"+t1.getPriority());
           System.out.println("Priority of Second thread is:"+t2.getPriority());
           System.out.println("Priority of Third thread after changing the max priority of group:"+t3.getPriority());
           System.out.println("----------------------------------------------------------------------------------");
       /*  System.out.println("Information about this thread Group:");
           System.out.println("ThreadGroup g is:"+g.activeCount());
           System.out.println("ThreadGroup g1 is:"+g1.activeCount());
           System.out.println("ThreadGroup g is:"+g.activeGroupCount());
           System.out.println("ThreadGroup g1 is:"+g1.activeGroupCount()); */ 
     }
}