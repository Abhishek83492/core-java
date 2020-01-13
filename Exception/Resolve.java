class Resolve
{
  public static void main(String[] args)
  {
       int i=90;
       int k=0;
       int div;
    
    try{
            System.out.println("division is"+i/k);
        }
     catch(Exception e)
     {
         System.out.println("Resolved division is:"+i/(k+2));
     }
}
}