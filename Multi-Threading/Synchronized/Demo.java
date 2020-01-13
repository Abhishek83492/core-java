class Happy
{
       public void wish(String name)
       {
     // synchronized(this)     //for object level lock.................
                           synchronized(Happy.class)//for class level lock..............
 {       for(int i=0;i<10;i++)
             {
                   System.out.println("Hiiiiiiii:");
                   try{
                            Thread.sleep(2000);
                       }
                   catch(InterruptedException e)
                   {}
                  System.out.println(name);
             }
        }
        }
}
class Mythread2 extends Thread
{
       Happy h;
       String name;
       Mythread2(Happy h,String name)
       {
           this.h=h;
           this.name=name;
       }
       public void run()
       {
             h.wish(name);
       }
}
class Demo
{
     public static void main(String[] args)
     {
           Happy h= new Happy();
           Happy h1= new Happy();   // passing one more object to diffrentiate.............
           Mythread2 m = new Mythread2(h,"Abhishek");
           Mythread2 m1 = new Mythread2(h1,"Gupta");
           m.start();
           m1.start();
      }
}     