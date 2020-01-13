class Clone implements Cloneable
{
   int i;
   int j;
 Clone(int i,int j)
 {
          this.i=i;
          this.j=j;
 }
 public Object clone()throws CloneNotSupportedException
 {
       return super.clone();
 }
 public int hashCode()
 {
      return super.hashCode();
 }
public static void main(String[] args)
 {
   try{
      Clone c = new Clone(10,25);
      Clone c1=(Clone)c.clone();
    //   c1.i=2222;
     //  c1.j=6666;
     System.out.println("Hashcode of reference");
      System.out.println(c.hashCode());
      System.out.println(c1.hashCode());
     System.out.println("---------------------------------------");
     System.out.println("Clone method inserted");
     System.out.println(c.i+"-----"+c.j);
     System.out.println(c1.i+"------"+c1.j);
      }
  catch(CloneNotSupportedException c)
  {
      }
  
}
}
  
 