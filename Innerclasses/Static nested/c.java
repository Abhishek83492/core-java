class C
{
    int x= 10;
   static int y = 20;
  static class D
   {
          public void m()
          {
             //    System.out.println(x);
                System.out.println(y);
          }
   
      public static void main(String[] args)
      {
           D d = new D();
          d.m();
      }
}
 }            