class Job
{
    private String role;
    private long salary;
    private int id;
    
    void setRole( String role)
    {
         this.role=role;
    }
    void setSalary(long salary)
    {
          this.salary=salary;
    }
    void setId(int id)
    {
          this.id=id;
    }
    String getRole()
    {
         return role;
    }
    long getSalary()
    {
        return salary;
    }
    int getId()
    {
         return id;
    }
}