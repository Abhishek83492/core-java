class TestAggregation
{
    public static void main(String[] args)
    {
         Author ath= new Author("Abhishek gupta",20,"indore");
         Book b=new Book("JAVA",10000,ath);
         b.showdetails(ath);
    }
}
