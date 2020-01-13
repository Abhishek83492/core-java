class Immutable2
{
  int i;
  Immutable2(int i)
  {
       this.i=i;
  }
  Immutable2 Modify(int j)
  {
      if(i==j)
       return this;
      else
       return new Immutable2(j);
  }
}
class Test
{
    public static void main(String[] args)
    {
         Immutable2 im = new Immutable2(30);
         Immutable2 im1 = im.Modify(40); 
         System.out.println(im==im1);  //False
         Immutable2 im2 = im.Modify(30);
         System.out.println(im==im2);  // True
     }
}
 
    