class Handling1
{
      public static void main(String[] args)
     {
       try{      System.out.println("Division is:"+10/0);
      }
       //catch(Exception e)
         catch(ArithmeticException  e)
       {
        //     System.out.println("Exception is");
             
          //  System.out.println("Exception is"+e.getmessage());
               
            System.out.println(e);
           //  System.out.println("Exception is"+e.tostring());
            
           }
}
}