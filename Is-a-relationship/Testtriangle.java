class Testtriangle
{
  public static void main(String[] args)
  {
      Triangle t = new Triangle();
      
      t.setColor("GREEN");
      t.setBorderwidth(6);
      t.setLength(5.3f);
      t.setHeight(4.6f);
      t.setBase(2.6f);
    
    System.out.println("______________________________________________________________");  
    System.out.println("Triangle color is:"+t.getColor());
    System.out.println("Triangle borderwidth is:"+t.getBorderwidth());
    System.out.println("Triangle length is:"+t.getLength());
    System.out.println("Triangle height is:"+t.getHeight());
    System.out.println("Triangle base is:"+t.getBase());
    System.out.println("Triangle area is:"+t.area());
    System.out.println("Triangle parameter is:"+t.parameter());
    System.out.println("______________________________________________________________");
}
}