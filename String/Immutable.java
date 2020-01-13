class Immutable
{
   public static void main(String[] args)
   {
   String s = new String("Abhishek");
   s.concat("Gupta");
   System.out.println("With String class");
   System.out.println(s);
   System.out.println("-------------------------------------------");
   StringBuffer s1 = new StringBuffer("Aman");
   {
   s1.append(" "+"chouhan");
   System.out.println("With StringBuffer Class");
    System.out.println(s1);
    System.out.println("-------------------------------------------");
   }
}
}
    