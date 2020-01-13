import java.io.*;
class Account implements Serializable
{
       String  user ="Abhishek";
    transient   String pass="gupta";
}
class Serializationdemo5
{
      public static void main(String[] args)throws Exception
      {
            Account a = new Account();
             File f = new File("ac.hhh");
             FileOutputStream fos = new FileOutputStream(f);
             ObjectOutputStream oos = new ObjectOutputStream(fos);
             oos.writeObject(a);
             System.out.println("data is inserted");
      
             FileInputStream fis = new FileInputStream(f);
             ObjectInputStream ois = new ObjectInputStream(fis);
             Account a1 = (Account)ois.readObject();
             System.out.println(a1.user+"------------"+a1.pass);
       }
}


