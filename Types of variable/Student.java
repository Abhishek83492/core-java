     class Student
     {
      int  rollno;
      String name;
      int  sub1;
      int  sub2;
      int  sub3;
      static String city="INDORE";

      Student(){};      
      Student(int i,String f, int a, int b, int c)
      {
             rollno=i;
             name=f;
             sub1=a;
             sub2=b;
             sub3=c;
      }
      void display()
      {
             System.out.println("your roll number is:\n"+rollno);
             System.out.println("your name is:\n"+name);
             System.out.println("your maths marks is:\n"+sub1);
             System.out.println("your science marks is:\n"+sub2);
             System.out.println("your english marks is:\n"+sub3);
             System.out.println("your live in :\n"+city);
      }
      double result()
      {
          return (double)(sub1+sub2+sub3)/3;
       }
       }
      class TestStudent
      {
      public static void main(String args[])
      {
      Student s = new Student(101879,"Abhishek gupta",98,92,94);
      Student s1 = new Student(101880,"Rahul singh",65,82,90);
      Student s2 = new Student(101881,"Aayush patidar",98,68,54);
             

             s.city="BHOPAL";
             s.display();
             
             System.out.println("your percentage is:\n "+s.result());
             System.out.println("********************************************END*****************************************");
             s1.display();
             System.out.println("your percentage is:\n "+s1.result());
             System.out.println("********************************************END*****************************************");
             s2.display();
             System.out.println("your percentage is:\n "+s2.result());
             System.out.println("*********************************************END****************************************");
     }
     }
            
        
                          
               
     