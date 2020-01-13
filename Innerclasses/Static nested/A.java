class A
{
     static class B
     {
     public static void main(String[] args)
    {
            System.out.println("inner main");
    }
   }
  
     public static void main(String[] args)
    {
            System.out.println("outer method");  // call by A$B
     }
}