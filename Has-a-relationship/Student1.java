class Student1
{
   int roll;
   Address address;
   
   Student1(int roll,Address address)
   {
         this.roll=roll;
         this.address=address;
   }
   
   void studentdetails(Address address1)
   {
       System.out.println("Roll number:"+roll);
       System.out.println("Street:"+address1.street);
       System.out.println("City:"+address1.city);
       System.out.println("State:"+address1.state);
       System.out.println("Zip:"+address1.zip);
   }
 }    
  
   
   