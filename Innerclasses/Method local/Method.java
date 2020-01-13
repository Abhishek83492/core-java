class Method
{
     public void m1()
     {
            class Method2
            {
                     public void m2(int x,int y)
                     {
                           System.out.println(x+y);
                     }
            }
            Method2 m = new Method2();
             m.m2(10,20);
             m.m2(100,200);
             m.m2(1000,2000);
       }
       public static void main(String[] args)
       {
               Method m3 =  new Method();
               m3.m1();
       }
}
      