import java.io.*;
class Directory
{
  public static void main(String[] args)
  {
     int count = 0;
      File f = new File("C:\\Program Files");
      System.out.println(f.exists());
     
      System.out.println(f.exists());
      System.out.println (  f.isFile());
        System.out.println (  f.isDirectory());
      String[] a = f.list();
     for(String s1: a)
     {
     //    File f1= new File(f,s1);
   //    if(f1.isDirectory())
   //  {
         count++;
        System.out.println(s1);
     //   }
    /* if(f1.isFile())
     {
         count++;
        System.out.println(s1);
        }*/
}
     System.out.println(count);
}
}