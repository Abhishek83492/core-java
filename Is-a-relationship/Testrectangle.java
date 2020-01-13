class Testrectangle
{
   public static void main(String[] args)
   {
       Rectangle r = new Rectangle();
       
        r.setColor("RED");
        r.setBorderwidth(3);
        r.setLength(6.2f);
        r.setBreadth(5.6f);
       
     System.out.println("_______________________________________________________________________");
      System.out.println("Rectangle borderwidth is:"+r.getBorderwidth());
      System.out.println("Rectangle color is:"+r.getColor());
      System.out.println("Rectangle length is:"+r.getLength());
      System.out.println("Rectangle breadth is:"+r.getBreadth());
      System.out.println("Rectangle parameter is:"+r.perameter());
      System.out.println("Rectangle area is:"+r.area());
      System.out.println("_______________________________________________________________________");
  }
}
      
 