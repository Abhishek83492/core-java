import java.io.*;
class Account1 implements Serializable
{
      String name= "Abhishek";
      transient  String pass= "gupta";
      private void writeObject(ObjectOutputStream oos1)throws Exception
      {
            oos1.defaultWriteObject();
            String empid = "121"+pass;
            oos1.writeObject(empid);
      }
      private void readObject(ObjectInputStream ois1)throws Exception
      {
            ois1.defaultReadObject();
            String em = (String)ois1.readObject();                   
             pass = em.substring(3);
       }
}
class Serialization8
{
      public static void main(String[] args)throws Exception
      {
          Account1 a  = new Account1();
          System.out.println(a.name+"--------------------------------------"+a.pass);  
          File f =  new File("jj.hek");
          FileOutputStream fos = new FileOutputStream(f);
          ObjectOutputStream oos = new ObjectOutputStream(fos);
          oos.writeObject(a);
         
          FileInputStream fis = new FileInputStream(f);
          ObjectInputStream ois = new ObjectInputStream(fis);
          Account1 a1 = (Account1)ois.readObject();
          System.out.println(a1.name+"-----------"+a1.pass);
       }
}
