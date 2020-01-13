 class Ab
{
      syncronized String  ma()
     {
         return System.out.println("its a parent method");
      }
  
}
 
class Bb extends Ab

{
        String  ma()
      {
         return System.out.println("its a child class method");
      }
}

class Test
{
      public static void main(String[] args)
      {
           Ab a =new Ab();
           a.ma();
            
           Bb b = new Bb();
           b.ma();
           
           Ab a1= new Bb();
           a1.ma();
       }
}