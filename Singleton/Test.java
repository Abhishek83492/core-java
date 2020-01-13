class Test
{
     private static Test f = new Test();
       
     private Test()
     {
      }
           public static Test getTest()
           {
                  return f;
           }
     
}
class Test1
{
       public static void main(String[] args)
       {
            Test T  = Test.getTest();
            Test T1  = Test.getTest();
            Test T2  = Test.getTest();
            Test T3  = Test.getTest();
           System.out.println("-------------------------------------");
           System.out.println("Hashcode of reference");
          System.out.println(T.hashCode());
          System.out.println(T1.hashCode());
          System.out.println(T2.hashCode());
          System.out.println(T3.hashCode());
           System.out.println("-------------------------------------");
           System.out.println("Comparison of reference");
           System.out.println(T==T1);
           
           System.out.println(T1==T2);
            
           System.out.println(T2==T);
            System.out.println("-------------------------------------");
         
            System.out.println("Equals method comparison");
           System.out.println(T.equals(T1));
         System.out.println(T1.equals(T2));
         System.out.println(T2.equals(T));
        }
}