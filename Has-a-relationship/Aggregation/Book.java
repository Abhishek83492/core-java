class Book
{
     String name;
     int price;
     Author auth;
     
     Book(String name,int price,Author auth)
     {
             this.name=name;
             this.price=price;
             this.auth=auth;
      }
        
     void showdetails(Author ath)
     {
         System.out.println("________________________________________________________");
         System.out.println("Book name is:"+name);
         System.out.println("Book price is:"+price);
         System.out.println("Book Author name is:"+auth.authorname);
         System.out.println("________________________________________________________");
     }
 }         
         