class Auto4
{
       public static void m1(Object o)
       {
              System.out.println("Object version");
              System.out.println("Autoboxing followed by widening is possible");
        }
       public static void main(String[] args)
       {
              int s= 50;
              m1(s);
        }
}
class Auto5
{
         public static void m2(Long l)
       {
              System.out.println("Long class");
              System.out.println("Widening followed by Autoboxing is not possible");
        }
       public static void main(String[] args)
       {
          //    int f= 50;
              long l = 50;
              m2(l);
        }
}
        