class Test
{
  public static void main(String[] args)
  {
 // try  {   
      dostuff();
           System.out.println(10/0);
        }
    // catch(Exception e)
     //  {
       //      System.out.println(not be divide by zero+"e");
     //  }
        static void dostuff()
       {
          domorestuff();
      //   System.out.println(10/0);
           System.out.println("hi");
       }
       static void domorestuff()
       {
        //    System.out.println(10/0);
             System.out.println("Hello");
       }
}