class Apple
{
  Apple getE()
  {
      return this;
  }
  
  void msg()
  {
      System.out.println("hello i am abhishek java developer");
  }
}
  
class Test2
{
  public static void main(String[] args)
  {
      new Apple().getE().msg();
  }
}
