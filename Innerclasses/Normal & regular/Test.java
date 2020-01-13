class A
{
     int x=10;
     class B
     {
          int x=100;
          class C
          {
               int x=1000;
               public void m()
               {
                     int x=10000;
                     System.out.println(x);
                     System.out.println(this.x);
                     System.out.println(B.this.x);
                     System.out.println(A.this.x);
                }
            }
         }
}
class Test
 {
       public static void main(String[] args)
        {
             A a = new A();
             A.B b = a.new B();
             A.B.C c = b.new C();
            c.m();
        }
  }