class Test2
{
     private static Test2 f = null;
       
     private Test2()
     {
      }
           public static Test2 getTest2()
           {
               if(f==null);
              {
                    f = new Test2();
              }
            //    else
           //   {
            System.out.println("your object is already created");
                    return f;
            //  }
           }
     
}
class Test4
{
      public static void main(String[] args)
      {
            Test2 t = Test2.getTest2();
            Test2 f1 = Test2.getTest2();
              Test2 f2 = Test2.getTest2();
             Test2 t3 = Test2.getTest2();
              
           
           System.out.println("-------------------------------------");
           System.out.println("#Hashcode of reference");
       System.out.println("-------------------------------------");
          System.out.println(t.hashCode());
          System.out.println(f1.hashCode());
          System.out.println(f2.hashCode());
          System.out.println(t3.hashCode());
           System.out.println("-------------------------------------");
           System.out.println("#Comparison of reference");
         System.out.println("-------------------------------------"); 
          System.out.println(t==f1);
           
           System.out.println(f1==f2);
            
           System.out.println(t3==t);
            System.out.println("-------------------------------------");
            System.out.println("#Equals method comparison");
         System.out.println("-------------------------------------");  
         System.out.println(t.equals(f1));
         System.out.println(f2.equals(t3));
         System.out.println(t3.equals(t));
        System.out.println("-------------------------------------"); 
        System.out.println("#Name of corresponding classes");
       System.out.println("-------------------------------------"); 
        System.out.println(t.getClass().getName());
        System.out.println(f1.getClass().getName());
        System.out.println(f2.getClass().getName());
         System.out.println(t3.getClass().getName());

}

}
           