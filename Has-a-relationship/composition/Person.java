class Person
{
    Job job;
    
    Person()
    {
        this.job=new Job();
        job.setSalary(10000L);
        
    }
        long getSalary()
    {
        return job.getSalary();
     }
}
        
      
 