abstract class Employee
{
      int id;
      String name;
      Employee()
       {
                 System.out.println("its a parent constructor");
       }
      Employee(int id,String name)
      {
          this.id=id;
          this.name=name;
      }
       abstract void print();
}

class JuniorEmployee extends Employee
{
       int age;
       double salary;
       String company;
       JuniorEmployee()
       {
                 System.out.println("its a child constructor");
       }
       JuniorEmployee(int id,String name,int age,double salary,String company)
       {
             super(id,name);
             this.age=age;
             this.salary=salary;
             this.company=company;
       }
        void print()
       {
              
              System.out.println("Employee id :"+id);
              System.out.println("________________________");
              System.out.println("Employee name :"+name);
              System.out.println("________________________");
              System.out.println("Employee age :"+age);
              System.out.println("________________________");
              System.out.println("Employee salary :"+salary);
              System.out.println("________________________");
              System.out.println("Employee company name :"+company);
           } 
}

class TestJuniorEmployee
{
        public static void main(String[] args)
        {
              JuniorEmployee je = new JuniorEmployee(8000014,"Abhishek",21,100000,"Tata Consultancy Service");
              je.print();

              System.out.println("Employee id :"+je.id);
              System.out.println("________________________");
              System.out.println("Employee name :"+je.name);
              System.out.println("________________________");
              System.out.println("Employee age :"+je.age);
              System.out.println("________________________");
              System.out.println("Employee salary :"+je.salary);
              System.out.println("________________________");
              System.out.println("Employee company name :"+je.company);
        }
}                   
      