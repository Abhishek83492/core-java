class Outer
{
     static class Inner
     {
           void inner()
           {
               System.out.println("Static class method");
           }
     }
  public static void main(String[] args)
  {
       Inner i = new Inner();
    /*    {
           void inner()
        {
              System.out.println("Override method");
         }
         };*/
            i.inner();
         Inner i1 = new Inner();        
    i1.inner();
  }
}