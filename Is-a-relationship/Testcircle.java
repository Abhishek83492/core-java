class Testcircle
{
    public static void main(String[] args)
    {
        Circle c = new Circle();
        //Shape s[] = new Shape[3];
        //s[0]=new Circle();
        c.setRadius(5.5f);
        c.setBorderwidth(1);
        c.setColor("BLUE");
   System.out.println("_______________________________________________________________________");
   System.out.println("Circle radius is:"+c.getRadius());
   System.out.println("Circle color is:"+c.getColor());
   System.out.println("Circle borderwidth is:"+c.getBorderwidth());
   System.out.println("Circle diameter is :"+c.diameter());
   System.out.println("Circle area is:"+c.area());
   System.out.println("Circle circumfrance is:"+c.circumfrance());
   System.out.println("________________________________________________________________________");
   }
}  
 
     