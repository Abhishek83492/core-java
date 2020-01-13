class Auto2
{
      public static void m1(int...x)
      {
           System.out.println("var-arg method");
       }
      public static void m1(long l)
      {
           System.out.println("widening");  
           System.out.println("widening get priority because it is old concept from java 1.0");
       }
        public static void main(String[] args)
       {
              int x =56;
              m1(x);
       }
}