class String2
{
   public static void main(String[] args)
   {
          String s = new String("Abhishek");
          String s0= "Abhishek";
          String s5= s0.toLowerCase();
          String s1=s.toLowerCase();
          String s2=s1.toUpperCase();
          String s3=s2.toLowerCase();
          String s4=s3.toUpperCase();
        
       System.out.println(s==s0); 
       System.out.println(s5==s1);
       System.out.println(s5==s3);
       System.out.println(s==s1);
       System.out.println(s2==s4);
       System.out.println(s1==s3);
       System.out.println(s4==s2);
   
       
       System.out.println("Hashcode of s5="+s5.hashCode());
       System.out.println("Hashcode of s0="+s0.hashCode());
       System.out.println("Hashcode of s="+s.hashCode());
       
       System.out.println("Hashcode of s1="+s1.hashCode());
       System.out.println("Hashcode of s2="+s2.hashCode());
       System.out.println("Hashcode of s3="+s3.hashCode());
       System.out.println("Hashcode of s4="+s4.hashCode());
}
}