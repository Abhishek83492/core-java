/*enum Beer
{
      Ab,rc,df,sd;//semi column is not important..........
}*/ 
class Test
{
  enum Beer//you may also declare enum inside a class but not inside a method because enum is static and final..........
{
      Ab,rc,df,sd;//semi column is not important..........
} 
     public static void main(String[] args)
     {
            Beer b = Beer.rc;
            System.out.println(b);//internally calls tostring method and return constant of enum...................
     }
}