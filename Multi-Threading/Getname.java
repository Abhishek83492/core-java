class Getname extends Thread
{
   
}
 class Getname1
{
    public static void main(String[] args)
    {
         System.out.println(Thread.currentThread().getName());
         Getname g = new Getname();
         System.out.println(g.getName());
         Thread.currentThread().setName("Abhishek");
         System.out.println(Thread.currentThread().getName());
         System.out.println(10/0);
    }
}