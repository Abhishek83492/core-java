import java.io.*;
class Dog implements Serializable
{  
//   static    int i=10;         //transient means not to serialize...............//static variable is not part of serialization because serialization is related to object.....................
//transient int j=20;//by the use of transient keyword jvm will provide default value for that particular datatype for security purpose...................
   int i =200;
   transient final int j=300;//in final variable the variable convert as value and serialize like value so transient is not applicable...........


}
class Serializationdemo
{
       public static void main(String[] args)throws Exception
       {
             Dog d = new Dog();
             File f = new File("abc.scc");
             FileOutputStream fos  = new FileOutputStream(f);//this first four lines is serialization.........................
             ObjectOutputStream oos = new ObjectOutputStream(fos);
             oos.writeObject(d);
             
             FileInputStream fis = new FileInputStream(f);
             ObjectInputStream ois = new ObjectInputStream(fis);//this four lines is deserialization.......................
             Dog d1 = (Dog)ois.readObject();
             System.out.println(d1.i+"--------------"+d1.j);
             



}
}
       