class Auto 
{
      public static void m1(Integer I)
      {
           System.out.println("Autoboxing");
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