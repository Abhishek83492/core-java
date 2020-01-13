import java.io.*;
class Test
{
  public static void main(String[] args)throws Exception
  {
        File f = new File("abc.txt");
        System.out.println(f.exists());
        f.createNewFile();
        
        System.out.println(f.exists());
         f.Write("97");
}
}