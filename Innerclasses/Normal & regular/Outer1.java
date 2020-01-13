class Outer1 // public , default ,final , abstract , strictfp
{
     int i = 70;
     static int j = 90;
     class Inner1  // protected , private , static
     {
            public void m2()
            {
                   System.out.println(i);
                   System.out.println(j);
            }
     }
     public static void main(String[] args)
     {
         //  Outer1.Inner1 i =
          new Outer1().new Inner1().m2();
         //  i.m2();
     }
}