 import java.io.FileNotFoundException;
 import java.io.PrintWriter;

 public class Handling5
 {
 public static void main(String[] args)throws Exception
 {
    PrintWriter pw;
      try
      {
       pw=new PrintWriter("abx");
       pw.println("saved");
       pw.write('4');
       }
    //   catch(Exception e)
    //   {
     //       System.out.println(e);
    //   }
       finally{
                     System.out.println("its a finally keyword");
                }
                       System.out.println("file saved successfully");
    
 }
 }
  