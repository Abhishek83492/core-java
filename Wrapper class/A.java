class A  // primitive to wrapper object............
{
     public static void main(String[] args)
     {
           int a = 50;
           Integer  i = Integer.valueOf(a);
           Integer j=a; // autoboxing.............. 
                
           System.out.println(a+"  "+i+"   "+j);
      }
}
class B // converting wrapper into primitive
{
      public static void main(String[] args)
      {
            Integer i1= new Integer(3);
          //  Integer i1= 3; 
            int i2 = i1.intValue();
            int j = i1; // auto unboxing..........

         System.out.println(i1+"      "+i2+"       "+j);
      }
}