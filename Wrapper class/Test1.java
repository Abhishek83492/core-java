class Test1
{
       // static Integer i = 10;
       // static Integer j= i;
     public static void main(String[] args)
     {
         
         Integer i = 10;
         Integer j= i;
           i++;
       System.out.println(i);
       System.out.println(j);
       System.out.println(i==j);     
}
}
