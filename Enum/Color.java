enum Color
{
      RED,GREEN{
                             public void info()
                              {
                                System.out.println("red awesome");
                              }
                              }
                             ,BLUE;
      public void info()
      {
           System.out.println("universal color");
      }
}
class Color1
{
       public static void main(String[] args)
       {
             Color[]  c=Color.values();
              for(Color c1: c)
              {
                   c1.info();
               }
        }
}
