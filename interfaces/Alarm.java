interface Alarm
{
     int x=20;
     
     void ringtone();
     void setalarmon();
     void setalarmoff();
}
interface Alarm1
{
     int y=45;
     
   //  void ringtone();
    // void setalarmon();
     void alarmin();
}
 class Tableclock implements Alarm,Alarm1
{
     public void ringtone()
     {
         System.out.println("kjhelrgife");
     }
     public void setalarmon()
     {
      }
     public void setalarmoff()
     {
      }
      public void alarmin()
      {
        System.out.println("kjhelrgife242342");
         
        }
      void g()
     {
         System.out.println("g  method");
}
}
 class Test 
  {
          public static void main(String[] args)
          {
              Tableclock tc = new Tableclock();
                  tc.ringtone();
                  tc.alarmin();
                  tc.g();
               System.out.println(tc.x);
               System.out.println(tc.y);
               System.out.println(Tableclock.x);
               System.out.println(Alarm.x);
             
              Alarm a = new Tableclock();
              System.out.println("interface");

           }
}    