interface I4
{
  float f = 3.14f;
  void m();
}
interface I3 extends I4
{
   void m1();
   void m2();
}
class Z1 implements I3
{
 public void m()
  {
     System.out.println("m() method");
   }
  public void m1()
  {
     System.out.println("m1() method");
   }
   public void m2()
  {
     System.out.println("m2() method");
   }
}
class Z
{
public static void main(String[] args)
{
   System.out.println("___________________");
   Z1 z1 = new Z1();
   z1.m();
   z1.m1();
   z1.m2();
   System.out.println("___________________");
   I3 i3 = new Z1();
   z1.m();
   z1.m1();
   z1.m2();
  System.out.println("___________________");
  I4 i4 = new Z1();
   z1.m();
  System.out.println("___________________");      
} 
}   