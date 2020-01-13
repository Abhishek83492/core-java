class Parent
{
     int age;
     Parent()
     {
       System.out.println("parent constructor");
     }   
     Parent(int age)
     {
         this.age=age;
          System.out.println("parent constructor one");
     }
     void calcium()
     {
          System.out.println("parent");
     }
}
class Child extends Parent
{
      int age1;
      Child(int age1)
      {
           this.age1=age1;
          System.out.println("child constructor");
       }
       void calcium()
       {
         //super.calcium();
          System.out.println("child");
       }
}
class Test
{
   public static void main(String[] args)
   {
        Child c = new Child(55);
     //   Parent p = new Child(55);
      //  p.calcium();
           c.calcium();
 }
}
      
