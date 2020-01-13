enum Mobile
{
     samsung(100,500),nokia(200,1000),mi(300,500),hcl;
     int price;
     int quantity;
     Mobile(int price,int quantity)
     {
          this.price=price;
          this.quantity=quantity;
     }
     Mobile()
     {
          this.price=60;
          this.quantity=1000;
     }
     public int getprice()
     {
           return price;
     }
      public int getquantity()
     {
           return quantity;
     }
}
class Testing
{
     public static void main(String[] args)
     {
          Mobile[] m = Mobile.values();
          for(Mobile m1 : m )
          {
                System.out.println(m1+"----------"+m1.getprice()+"-----"+m1.getquantity());
          }
     }
}
