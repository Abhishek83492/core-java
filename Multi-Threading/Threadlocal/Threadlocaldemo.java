class Threadlocaldemo extends Thread
{
      public static void main(String[] args)
      {
          ThreadLocal tl = new ThreadLocal()
           {
                public Object initialValue()
                {
                     return "Abhishek";
                 }
            };
          System.out.println(tl.get());
          tl.set("Tiger");
          System.out.println(tl.get());
          tl.remove();
          System.out.println(tl.get());
      }
}    