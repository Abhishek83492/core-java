import java.util.Scanner;
class B
{
  A a;  //  its instance reference
  
  B(A a)  // its local or fomal reference
  {
     this.a=a;
  }
  void display()
  {
     System.out.println(a.data);
  }
}

class A 
{
  int data;
 A()
 {
      B b = new B(this);
      b.display();
  }
}
 class Test1
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  int data;
   data=sc.nextInt();
  System.out.println("Enter the data value");
  A a1 = new A();
    
  }
}
