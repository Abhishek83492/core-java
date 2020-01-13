class Mainmethodoverloading
{
     public static void main(String[] args)
      {
              System.out.println("main method");
              main("Abhishek gupta");
              main(50);
      }
     public static void main(String s)
      {
              System.out.println("String argument");
      }
     public static void main(int i)
      {
               System.out.println("its integer argument");
       }
}
   