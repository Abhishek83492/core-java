class C
{
   int i;
   C(int i)
   {
         this.i=i;
   }
}
class D implements Cloneable
{
    C c;
    int j;
    D(C c, int j)
    {
        this.c=c;       
        this.j=j;
    }
    public Object clone()throws CloneNotSupportedException
    {
        C cr = new C(c.i);
        D d2 = new D(cr,j);
       return d2;
    }
}
class DeepCloning
{
      public static void main(String[] args)
      {
         try{
            C c = new C(20);
            D d = new D(c,50);
            D d1 = (D)d.clone();
        System.out.println(d1.c.i+"----------------"+d1.j);
        System.out.println(d.c.i+"----------------"+d.j);
        d1.c.i=100;
        d1.j=99;
        System.out.println(d1.c.i+"----------------"+d1.j);
        System.out.println(d.c.i+"----------------"+d.j);
        }
      catch(CloneNotSupportedException c)
     {
}
      }
}

  
    
