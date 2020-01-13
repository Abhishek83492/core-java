class Auto3 
{
      public static void m1(Integer i)
      {
           System.out.println("Autoboxing");
       }
      public static void m1(int...x)
      {
           System.out.println("var-arg method");  
       }
        public static void main(String[] args)
       {
              int x =56;
              m1(x);
       }
}