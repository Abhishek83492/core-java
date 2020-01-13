class Method4
{
     static  int x = 10;
     static int y = 20;
     public static void m()
     {
        int z= 30;
        final int w = 40;
        class Method5
        {
              int d = 50;
               public void m1()
               {
                     int c = 60;
                      System.out.println(x);
                      System.out.println(y);
                      System.out.println(z);
                      System.out.println(w);
                      System.out.println(d);
                      System.out.println(c);
               }
       }
   Method5 m2 = new Method5();
   m2.m1();
 }
public static void main(String[] args)
 {
      Method4 m5 = new Method4();
      m5.m();
 }
}         