class Test
{
       void skill()
       {
             System.out.println("danser");
        }
}
class Test1
{
   public static void main(String[] args)
   {
       Test t = new Test()
       {
              void skill()
             {
                     System.out.println("programmer");
             }
      };
        System.out.println("--------------------------------------");
      t.skill();
       
     Test t1 = new Test();
        System.out.println("--------------------------------------");

     t1.skill();
       
       Test t2 = new Test();
         System.out.println("--------------------------------------");
     t2.skill();
     
       Test t4 = new Test()
       {
           void skill()
           {
                System.out.println("lover");
        }
    };
        System.out.println("--------------------------------------");
     t4.skill();
     System.out.println(t.getClass().getName());
     System.out.println(t1.getClass().getName());
     System.out.println(t2.getClass().getName());
     System.out.println(t4.getClass().getName());
   
    
  }
}
    