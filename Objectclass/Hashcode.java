class Name
{
    int sno;
    String name;
    
    Name(int sno,String name)
    {
          this.sno=sno;
          this.name=name;
    }
    public String toString()
    {
         return "Serial number is"+sno+"Name is"+name;
    }
    public int hashCode()
    {
     //  return getClass().getName()+"@"+Integer.toHexString(hashCode());
        return sno;
    }
  public static void main(String[] args)
  {
      Name h = new Name(101,"Ab");
      Name h1 = new Name(102,"gh");
      Name h2 = new Name(103,"hk");
   
      System.out.println(h.hashCode());
      System.out.println(h1.hashCode());
      System.out.println(h2.hashCode());
      System.out.println(h);
      System.out.println(h1);   
      System.out.println(h2);      
  }
}      