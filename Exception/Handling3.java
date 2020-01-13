class Handling3
{
  public static void main(String[] args)
  {
     String a[]={"25,36,54"};
      try{
              System.out.println(a[0]);
              System.out.println(a[3]);
           }
       catch(Exception e)  //ArrayindexoutofboundException
          {
                System.out.println(e);
           }
              
}
}