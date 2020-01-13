import java.util.*;
class EmployeeComparable implements Comparable
{
     int emid; 
    String name;
    EmployeeComparable(int emid,String name)
    {
         this.emid=emid;
         this.name=name;
    }
    public String toString()
    {
       return name+"-----"+emid;
    }
    public int compareTo(Object obj)
   {
        int emid1 = this.emid;
        EmployeeComparable ec = (EmployeeComparable)obj;
        int emid2 = ec.emid;
        if(emid1 > emid2)
            return +1;
        else if(emid1 < emid2)
           return -1;
        else
           return 0;
    }
}
class ComparableComparater
{
    public static void main(String[] args)
    {
         EmployeeComparable ec1 = new EmployeeComparable(25,"Abhishek");
         EmployeeComparable ec2 = new EmployeeComparable(100,"Deepak");
         EmployeeComparable ec3 = new EmployeeComparable(8,"Avinash");
         EmployeeComparable ec4 = new EmployeeComparable(65,"Rahul");
         EmployeeComparable ec5 = new EmployeeComparable(10,"Aditya");

        TreeSet ts = new TreeSet();
        ts.add(ec1);
        ts.add(ec2);
        ts.add(ec3);
        ts.add(ec4);
        ts.add(ec5);
       
        System.out.println(ts);
    }
}   
   