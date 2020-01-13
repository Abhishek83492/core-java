abstract class Employee
{
      int Classifies=100;
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
       static {
                    System.out.println("its your details");
                    System.out.println("________________________");
                 }
       static void test()
       {
                 System.out.println("________________________");
                 System.out.println("Its a static method of parent class");
                 System.out.println("________________________");
       }
}

class JuniorEmployee extends Employee
{
       int age;
       double salary;
       String company;
       JuniorEmployee()
       {        
               //  super();
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
              System.out.println("________________________");
           } 
}

class TestJuniorEmployee
{
        public static void main(String[] args)
        {
              JuniorEmployee je = new JuniorEmployee(8000014,"Abhishek",21,100000,"Tata Consultancy Service");
              JuniorEmployee je1 = new JuniorEmployee(8000015,"Deepak",26,150000,"Infosys");
              JuniorEmployee je2 = new JuniorEmployee(8000016,"Vijay",26,200000,"Capemini");
           //   JuniorEmployee je3 = new JuniorEmployee();
          //    Employee e = new JuniorEmployee(8000016,"Vijay");
           //    System.out.println("parent:"+e.id);
             // System.out.println("parent:"+e.name);
               Employee e = new JuniorEmployee();
              Employee.test();
              je.print();
              je1.print();
              je2.print();
             System.out.println("value:"+ je.Classifies);
              System.out.println("________________________");
              System.out.println("________________________");
              System.out.println("its an example how to fill your data"); 
              System.out.println("Employee id :"+je.id);
              System.out.println("________________________");
              System.out.println("Employee name :"+je.name);
              System.out.println("________________________");
              System.out.println("Employee age :"+je.age);
              System.out.println("________________________");
              System.out.println("Employee salary :"+je.salary);
              System.out.println("________________________");
              System.out.println("Employee company name :"+je.company);
              System.out.println("________________________");
              System.out.println("________________________");
        }
}                   
      