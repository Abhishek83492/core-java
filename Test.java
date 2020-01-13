class A
{
 private  void run()
{
System.out.println("Abhihshek");

}
}
class B extends A
{
  static void run()
{
System.out.println("GUpta");
}
}
class Test 
{
public static void main(String[] args)
{
B b = new B();
b.run();
}
}