public class R
{
       public int i=34;
       public void unit()
       {
               System.out.println("its a outer class method");
       }
       interface I
       {
            void mass();
       }
}
class R1 implements R.I
 {
        public void mass()
        {
            System.out.println("its a  inner interface method");
         }
}
class Test
{
       Test t = new Test();
        t.mass();
     //   t.unit();
     //   t.i();
}
           

            
             