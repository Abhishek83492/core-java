import java.lang.Throwable;
class Finalize
{ 
  int i;
  Finalize(int i)
  {
      this.i=i;
  }
  protected void finalize() throws Throwable
  {
      //  System.out.println("finalize method");
      System.out.println("finalize method="+i);
     //   super.finalize();
  }
}

public class FinalizeTest  
   {
   public static void main(String[] args)
   {
         Finalize f = new Finalize(12);
         Finalize f1 = new Finalize(56);
         Finalize f2 = new Finalize(53);
         try
         {
             f.finalize();
         }
         catch(Throwable e)
         {
            System.out.println(e);
         } 
         f= f1;
         f=f2;
       //      System.gc();  // Explicitly called garbage collector....
      //   Runtime.getRuntime().runFinalization();
    System.out.println("done");
 }
}