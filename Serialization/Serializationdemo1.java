import java.io.*;
class Rat implements Serializable
{
     int i=10;
     int j=20;
}
class White implements Serializable
{
     int i=20;
     int j=60;
}
class Elect implements Serializable
{
      int i=50;
      int j=6;
}
class Serializationdemo1
{
   public static void main(String[] args)throws Exception
   {
        Rat r =new Rat();
        White w = new White();
        Elect e = new Elect();
    
        File f = new File("hh.sed");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(r);
        oos.writeObject(w);
        oos.writeObject(e);
        System.out.println("data inserted to the file");
         
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Rat r1 = (Rat)ois.readObject();
        White w1 = (White)ois.readObject();
        Elect e1 = (Elect)ois.readObject();
        System.out.println(r1.i+"------------"+r1.j);
        System.out.println(w1.i+"------------"+w1.j);
         System.out.println(e1.i+"------------"+e1.j);
   }
}