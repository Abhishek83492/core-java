import java.io.*;
class Animal
{
     int i=10;//instance control flow jvm check it implements serializable or not then jvm provide its parent official value.............. 
     Animal()
      {
            System.out.println("its animal");
      }
}
class Janvar extends Animal implements Serializable
{
    int j =20;
    Janvar()
    {  
           System.out.println("its Janvar");
     }
}
class Serializabledemo0
{
    public static void main(String[] args)throws Exception
     {
           Janvar j1 = new Janvar();
           j1.i=1000;
           j1.j=2000;
           File f = new File("hh.tyt");
           FileOutputStream fos = new FileOutputStream(f);
           ObjectOutputStream oos = new ObjectOutputStream(fos);
           oos.writeObject(j1);
           System.out.println("Data inserted");
           
           FileInputStream fis = new FileInputStream(f);
           ObjectInputStream ois = new ObjectInputStream(fis);
           Janvar j2 = (Janvar)ois.readObject();
           System.out.println(j2.i+"------------"+j2.j);
     }
}
       