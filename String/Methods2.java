class Methods2
{
      public static void main(String[] args)
     {
          String s="    Abhishek gupta   ";
          String s1="   ABHISHEK GUPTA    ";
          System.out.println("Displayed name------"+s);
          System.out.println("Displayed name------"+s1);
          System.out.println("Replace method for s---------"+s.replace('b','h'));
          System.out.println("Replace method for s1---------"+s1.replace('B','H'));  // to replace char by other
          System.out.println("Equals Ignore method---"+s.equalsIgnoreCase(s1)); // to ignore capital or small
          System.out.println("Trim method for s-------"+s.trim());
          System.out.println("Trim method for s1-------"+s1.trim()); // To remove blank spaces from right and left
          System.out.println("Index of method for s----"+s.indexOf('a'));
          System.out.println("Index of method for s1----"+s1.indexOf('A'));  // To find char in string
         System.out.println("Last Index of method for s-----"+s.lastIndexOf('a'));
          System.out.println("Last Index of method for s1----"+s1.lastIndexOf('A')); // To find last char between two char in string
         System.out.println("Substring method---"+s.substring(2,6));
         }

}