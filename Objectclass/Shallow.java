 class A
{
  int i;
  A(int i)
  {
       this.i=i;
  }
}
class B implements Cloneable
{
  A obj;
  int j;
  
  B(A obj,int j)
  {
      this.obj=obj;
      this.j=j;
  }
  public Object clone()throws CloneNotSupportedException
 {
      return super.clone();
 }
}
class Shallow
{
  public static void main(String[] args)
  {
   try{
       A a = new A(10);
       B b = new B(a,20);
       B b1 = (B)b.clone();

     System.out.println("Shallow cloning is inserted");
     System.out.println();
     System.out.println(b.j+"---------"+b.obj.i);
     System.out.println(b1.j+"---------"+b1.obj.i); 
     System.out.println(b.j+"---------"+a.i);
     System.out.println(b1.j+"---------"+a.i);
     System.out.println("--------------------------------------------");
     b1.obj.i=100;
     b1.j=66;
     System.out.println("After changing the values");
     System.out.println(b.j+"---------"+b.obj.i);
     System.out.println(b1.j+"---------"+b1.obj.i);
     System.out.println(b.j+"---------"+a.i);
     System.out.println(b1.j+"---------"+a.i);
     System.out.println("--------------------------------------------");
     System.out.println();
    }
   catch(CloneNotSupportedException c)
   {
}
  }
}