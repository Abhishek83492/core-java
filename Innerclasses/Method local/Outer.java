class Outer
{
     int x =10;
     static int y = 20;
     public void m()
     {
           class Inner
           {
                  public void m1()
                  {
                          System.out.println("Instance variable"+x);
                          System.out.println("Static variable"+y);
                  }
            }
         Inner i = new Inner();
         i.m1();
      }
    public static void main(String[] args)
    {
          Outer o = new Outer();
          o.m();
    }
}     