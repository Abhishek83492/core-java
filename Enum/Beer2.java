enum Beer2
{
      kd,kt,kk,st,sdt,jh;
}
class Test3
{
     public static void main(String[] args)
     {
         
          Beer2[] b = Beer2.values();//values method is used to get all objects constant present in enum..............
          for(Beer2 b1 : b)
          {
              System.out.println(b1+"---------"+b1.ordinal());
          }
     }
}