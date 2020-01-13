class Outer56
{
     public void m()
     {
           int x=45;       // give compile time error......... in version till 1.6 after 1.6 its complitely valid...........
        // final int x = 45;
              class Inner1
              {
                       public void m2()
                       {
                             System.out.println(x);
                        }
              }
          Inner1 i = new Inner1();
          i.m2();
      }
     public static void main(String[] args)
     {
            Outer56 o = new Outer56();
            o.m();
     }
}   