import java.io.*;
class Fileindifferentpath
{
     public static void main(String[] args)throws Exception
     {
          File f = new File("D:\\xy","j.txt");
          f.createNewFile();
          File f1 = new File("hhh");
          f1.mkdir();
       System.out.println (  f1.isFile());
        System.out.println (  f1.isDirectory());
       String[] s = f1.list();
       System.out.println(s);
     
}
}