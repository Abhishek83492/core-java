class MethodsIndex
{
     public static void main(String[] args)
     {
    try{
     String s = "abcdef";
     String s1="ABCDEF";
     System.out.println("char is"+s.charAt(2));
     System.out.println(s.charAt(40));   // RE:-StringoutofboundException
     }
      catch(Exception n)
      {
            System.out.println("your given index number is incorrect");
       } 
    // System.out.println(s.equalsIgnoreCase(s1));
}
}