import java.io.*;
class External implements Externalizable
{
      String s;
      int i;
      int p;
      public External()
      {
             System.out.println("");
      }
      public void writeExternal(ObjectOutputStream oos)
      {
                     oos.writeObject(s); 
      }
      public void readExternal(ObjectInputStream ois)
      {
                    ois.readObject(i);
      }
}
class Externalizabledemo
{
    public static void main(String[] args)
    {
        External e = new External("Abhi",10,56);
        File f = new File("hh.tyt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(e);
        System.out.println("Data inserted");
    
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        External e1 = (External)ois.readObject();
        System.out.println(e1.s+"--------"+e1.i+"--------"+e1.p);     
     }
}   
        
         