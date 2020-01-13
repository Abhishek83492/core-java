class Capacity
{
      public static void main(String[] args)
     {
     StringBuffer sb = new StringBuffer("Abhishek gupta");
     System.out.println(sb.capacity());
     sb.append("AMBANI");
     System.out.println(sb);
     System.out.println(sb.capacity());
   //  sb.length()+16;
     sb.append("Helloiamtheworld");
     System.out.println(sb.capacity());
     sb.setCharAt(5,'r');// its a void method
     System.out.println(sb); // change the char with index value
     System.out.println(sb.insert(5,"Deepak")); // to add String between the existing string
     System.out.println(sb.delete(5,10));
     StringBuffer sb1 = new StringBuffer("hello"); 
      System.out.println(sb1.capacity());
      sb1.trimToSize();
     System.out.println(sb1.capacity());

  
       

           
      }
}
     