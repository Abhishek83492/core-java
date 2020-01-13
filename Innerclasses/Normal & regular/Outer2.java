class Outer2
{
       int i =10;
       static int j=20;
       class Inner2
       {
            int i= 100;
             public void m()
             {
                  int i = 1000;
                   System.out.println("Inner class method");
                   System.out.println(i);
                   System.out.println(this.i);
                   System.out.println(Outer2.this.i);
                   System.out.println(j);
             }
        }
   public static void main(String[] args)
   {
         Outer2.Inner2 i = new Outer2().new Inner2();
         i.m();
   }
}