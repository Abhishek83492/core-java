class Change 
{
  
   //String s= "hi";
   public String toString()
   {
      //   return getClass().getName()+"@"+Integer.toHexString(hashCode());
         return getClass().getName();
   }
}
class Change1
{
    public static void main(String[] args)
    {
         Change c = new Change();
         Change c1 = new Change();
       System.out.println(c);
     
         System.out.println(c1);
    }
}