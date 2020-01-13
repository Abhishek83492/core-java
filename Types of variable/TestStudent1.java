class TestStudent1
{
        public static void main(String args[])
         {
            Student s = new Student(101879,"Abhishek gupta",98,92,94);
            Student s1 = new Student(101880,"Rahul singh",65,82,90);
            Student s2 = new Student(101881,"Aayush patidar",98,68,54);
            
             s.display();
             System.out.println("your percentage is:\n "+s.result());
             System.out.println("****************************************************************************************");
             s1.display();
             System.out.println("your percentage is:\n "+s1.result());
             System.out.println("****************************************************************************************");
             s2.display();
             s2.city="BHOPAL";
             System.out.println("your percentage is:\n "+s2.result());
             System.out.println("****************************************************************************************");
             
             
             
         }
}