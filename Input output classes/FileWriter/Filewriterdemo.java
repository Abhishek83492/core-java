import java.io.*;
class Filewriterdemo
{
      public static void main(String[] args)throws Exception
      {
            FileWriter fw = new FileWriter("hh.txt");
            fw.write(100);
            fw.write('j');
            fw.write("100");
            char[] ch ={'a','b','c'};
             fw.write(ch);
             fw.write('\n');
             fw.write('\n');
             fw.write("100");
             fw.flush();
             fw.close();
     }
}