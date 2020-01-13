class Handling2
{
  public static void main(String[] args)
  {
         String s = null;
     try{
              System.out.println(s.length());
          }
        
         //catch(NullPointerException ne)
         catch(Exception ne)
         {
               System.out.println(ne);
         }
}
}