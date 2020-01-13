class Outer
{
      class Inner
      {
           public void m()
         {
           System.out.println("its inner method");
        }
              
      }
/*        public void m1()
        {
         System.out.println("i am outer class m1 method");

             Inner i = new Inner();
            i.m();
         }*/
     public static void main(String[] args)
    {
      System.out.println("its outer main method");
     //    Outer o = new Outer();
      //     o.m1();
       //   Outer.Inner i = o.new Inner();
       //  Outer.Inner i =
          new Outer().new Inner().m();
         
       // i.m();

      }
}
