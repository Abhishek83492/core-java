interface I8
{
void define();
     interface I9
     {
          void define1();
                  interface I10
                  {
                      void define2();
     }
    }
 }
     
    class Y implements I8.I9.I10,I8.I9,I8
    {
         public void define1()
         {
             System.out.println("its a inner interface");
         }
          public void define()
         {
             System.out.println("its a outer interface");
         }
           public void define2()
         {
             System.out.println("its a inner inner interface");
         }
    }
    
    class W
    {
         public static void main(String[] args)
         {
             Y y = new Y();
              y.define1();
          System.out.println("_____________________________");
             I8.I9 i = new Y();
             i.define1();
           System.out.println("_____________________________");
             I8 u = new Y();
              u.define();
            System.out.println("_____________________________");
              I8.I9.I10 ii = new Y();
              ii.define2();
             System.out.println("_____________________________");
              Y y1 = new Y();
               y1.define2();
             System.out.println("_____________________________");
                  
           

         }
    }