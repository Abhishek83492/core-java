class Constructor
{
     Constructor()
      {
      System.out.println("zero");
      }
     Constructor(int t)
      {
      //  this();
      System.out.println("one");  
      }
      Constructor(int x,int y)
      {
      // this(10);
      System.out.println("two");  
      }
   public static void main(String[] args)
    {
     //   Constructor c = new Constructor(40,65);
      //   Constructor c1 = new Constructor(10);
         Constructor c2 = new Constructor();
     
 }
}

class Child extends Constructor
{
      Child()
      {
        
          System.out.println("child zero");
      }
     Child(int x)
      {
      // this();
        System.out.println("child one");
      }
      Child(int x,int y)
      {
          // super(10);
       System.out.println("child two");
       }
   public static void main(String[] args)
    {
      //  Child c7 = new Child();
        Constructor c2 = new Child(10,65);

     }
}
   
   
    

      