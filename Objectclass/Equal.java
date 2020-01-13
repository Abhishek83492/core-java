class Equals
{
   int rollno;
   String name;
   
   Equals(int rollno,String name)
   {
       this.rollno=rollno;
       this.name=name;
   }
  public boolean equals(Object obj)
   {
   try{
        int rollno1=this.rollno;
        String name1=this.name;
        Equals e = (Equals)obj;
        int rollno2 = e.rollno;
        String name2=e.name;
   
        
         if(rollno1==rollno2 && name1.equals(name2))
         {
              return true;
         }
         else
         {
             return false;
         }
   
 }
   catch(NullPointerException m)
   {
         return false;
   }
   catch(ClassCastException m)
   {
         return false;
   }
} 
  public static void main(String[] args) 
  {
      Equals e1= new Equals(101,"Abhishek");
      Equals e2= new Equals(102,"Akash");
      Equals e3= new Equals(101,"Abhishek");
      Equals e4=e1;
    
      System.out.println("This is equals method result");
      System.out.println(e1.equals(e2));  
      System.out.println(e1.equals(e3));
      System.out.println(e1.equals(e4));
      System.out.println("---------------------------------------------------------");
      System.out.println("This is Exception result");
      System.out.println(e1.equals("Abhishek"));
      System.out.println(e1.equals(null));
      System.out.println("----------------------------------------------------------");   
      System.out.println("This is Hash Code result");
      System.out.println(e1.hashCode());
      System.out.println(e3.hashCode());
      System.out.println(e4.hashCode());
      System.out.println(e2.hashCode());
      System.out.println("-----------------------------------------------------------");
   }
} 