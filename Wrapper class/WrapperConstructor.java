class WrapperConstructor
{
     public static void main(String[] args)
     {
          Integer i = new Integer(10);
          Integer i1 = new Integer("10");
         
       //   Byte B = new Byte(20);
       //   Byte B1 = new Byte("20");
         
          Float f = new Float(20.3f);
          Float f1 = new Float("20.3f");
          Float f2 = new Float(20.3);
          Float f3 = new Float("20.3");
        
         Double d = new Double(50.3);
         Double d1 = new Double("50.3");

        Character c = new Character('a');
  //      Character c1 = new Character("ab");      String can not be converted int char in character class......

        Boolean b = new Boolean(true);
        Boolean b1 = new Boolean(false);
        Boolean b2 = new Boolean("true");
        Boolean b3 = new Boolean("false");
        Boolean b4 = new Boolean("True");
        Boolean b5 = new Boolean("False");
        Boolean b6 = new Boolean("yes");
        Boolean b7 = new Boolean("no");
        
       System.out.println("Interger case primitive------"+i);
       System.out.println("Interger case string------"+i1);
       System.out.println("--------------------------------------------------");
   //    System.out.println("Byte case primitive--------"+B);
   //    System.out.println("Byte case String--------"+B1);
   //    System.out.println("--------------------------------------------------");
       System.out.println("Float case primitive--------"+f);
       System.out.println("Float case String--------"+f1);
       System.out.println("Float case Double--------"+f2);
       System.out.println("Float case Double String--------"+f3);
       System.out.println("--------------------------------------------------");
       System.out.println("Character case primitive---------"+c);
    //   System.out.println("Character case String---------"+c1);
       System.out.println("--------------------------------------------------");
       System.out.println("Boolean case primitive true-------"+b);
       System.out.println("Boolean case primitive false-------"+b1);
       System.out.println("Boolean case String true-------"+b2);
       System.out.println("Boolean case String false-------"+b3);
       System.out.println("Boolean case String True-------"+b4); 
       System.out.println("Boolean case String False-------"+b5);
       System.out.println("Boolean case String yes-------"+b6);
       System.out.println("Boolean case String no-------"+b7);
       System.out.println("--------------------------------------------------"); 
       System.out.println("Comparison of primitive--------"+b.equals(b1));
       System.out.println("Comparison of String-------"+b2.equals(b3));
       System.out.println("Comparison of Capital String--------"+b4.equals(b5));
       System.out.println("Comparison of String other worlds------"+b6.equals(b7));
}
}  