class String1
{
   public static void main(String[] args)
   {
         String s = new String("Abhishek Gupta");  // two objests created one in heap and other in S.c.p
         String s2="Abhishek Gupta";  // Already present in s.c.p than it point s.c.p object
         String s1 = new String("Abhishek Gupta");  
         String s3="Abhishek Gupta";
         String s4=new String("Deepak");
         String s5="Deepak";
    
          String s6=s.concat("hello");
         String s7 = s2.concat("hello");

         System.out.println(s);      //System.out.println(s6);
         System.out.println(s2);    // System.out.println(s7); to concat result
 
         System.out.println(s==s1);
          System.out.println(s2==s3);
        
         System.out.println(s2.hashCode());
         System.out.println(s3.hashCode());
         System.out.println(s.hashCode());
         System.out.println(s1.hashCode());
         System.out.println(s4.hashCode());
         System.out.println(s5.hashCode());
   }
}