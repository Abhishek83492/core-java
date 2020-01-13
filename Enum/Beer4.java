enum Beer4
{
      jk,lh,ki,kh;
      Beer4()//enum constant are static so all objects are created at the time of class loading so 4 times print constuctor...........
      {
          System.out.println("constructor");
      }
}
class Test6
{
      public static void main(String[] args)
      {
           Beer4 b = Beer4.ki;
           System.out.println("hello");
       }
}