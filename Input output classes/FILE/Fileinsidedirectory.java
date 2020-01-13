import java.io.*;
class Fileinsidedirectory
{
  public static void main(String[] args)throws IOException
  {
       File f = new File("Abhi");
       f.mkdir();
    //   File f1=new File("Abhi","d.txt");
    //   f1.createNewFile();
         File f2 = new File(f,"d1.txt");
         f2.createNewFile();
} 
}