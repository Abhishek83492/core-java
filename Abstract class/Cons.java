class Cons
{
    private Cons()
              {
                   System.out.println("zero");
               }
           Cons(int x)
              {
                  this();
                   System.out.println("one");
              }
}
class Cons1 extends Cons
{
       Cons1(int e)
        {
            super(10);
           System.out.println("one child");
       }
}
class Test1
{
          public static void main(String[] args)
         {
               Cons c = new Cons1(10);
        }
}    