class Teststudent1
{
    public static void main(String[] args)
    {
       Address address1;
       address1=new Address("71-A","INDORE","MADHYAPRADESH","40");
       Student1 s = new Student1(1,address1);
       s.studentdetails(address1);
    }
}