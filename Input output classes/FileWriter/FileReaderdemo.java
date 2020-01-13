import java.io.*;
class FileReaderdemo
{
   public static void main(String[] args)throws Exception
   {
        // FileReader fr = new FileReader("hh.txt");
      //  FileReader fr = new FileReader(fw);
         int i = fr.read();
         while(i!=-1)
         {
              System.out.print((char)i);
              i = fr.read();
         }
    }
}