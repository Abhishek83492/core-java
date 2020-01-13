class Nullpointer
/* {
            static Integer i=0;
    public static void main(String[] args)
    {
              int j=i;
      System.out.println(j);
      }
}*/
{
          static Integer i;
    public static void main(String[] args)
    {
        try{
          int k=i;
      System.out.println(k);
       }
        catch(NullPointerException n)
       {
                System.out.println("your integer is object type so its value by jvm is null");
   }
 }
}