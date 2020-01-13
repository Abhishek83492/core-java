import java.util.*;
import java.io.*;
class Propertiesdemo
{
   public static void main(String[] args)throws Exception
   {
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("abc.txt");
        p.load(fis);
        System.out.println(p);
        String s=p.getProperty("user");
        System.out.println(s);
        p.setProperty("pass","9999");
       p.setProperty("Add","71");
        FileOutputStream f = new FileOutputStream("abc.txt");
        p.store(f,"Updated by Abhishek gupta");
    }
}
    