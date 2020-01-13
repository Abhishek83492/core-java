class Asserts
{
     public static void main(String[] args)throws Exception
     {
           int x= 10;
           ;;;;;;;;;;;;;;;;;;;;;;;;
           ;;;;;;;;;;;;;;;;;;;;;;;;
           ;;;;;;;;;;;;;;;;;;;;;;;;
        //   assert(x > 10):"its is very wrong comparison";  //it is used to perform debugging and it is alternative to sop's............
        //   assert(x==10):++x;//"if first argu is true then no need of second and second is only for extra information..........
        //   assert(x>10):++x;//"in assertion exception result by defualt is 11...........  
           assert(x>10):m1();//"calling static method as argument.................
           ;;;;;;;;;;;;;;;;;;;;;;;;
           ;;;;;;;;;;;;;;;;;;;;;;;;
           ;;;;;;;;;;;;;;;;;;;;;;;;
           ;;;;;;;;;;;;;;;;;;;;;;;;
           ;;;;;;;;;;;;;;;;;;;;;;;;
           System.out.println(x);
     }
    public static int m1()//return type must be required if void you are using than compiler will give you left and right...................
    {
          return 1010;
    }
}