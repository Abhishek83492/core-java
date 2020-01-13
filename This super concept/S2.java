class S2
{
 void m(S2 o)
  {
    System.out.println("method is invoked");
   }
 
   void p()
  {
     m();
  }
 
  public static void main(String[] args)
  {
    S2 o1 = new S2();
    o1.m(o1);
}
}
      