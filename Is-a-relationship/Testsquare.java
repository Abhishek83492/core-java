class Testsquare 
{
     public static void main(String[] args)
     {
         Square s = new Square();
         s.setSide(5.6f);
         s.setColor("BLACK");
         s.setBorderwidth(5);
     
     System.out.println("__________________________________________________________");
     System.out.println("Square side is:"+s.getSide());
     System.out.println("Square color is:"+s.getColor());
     System.out.println("Square borderwidth is:"+s.getBorderwidth());
     System.out.println("Square area is:"+s.area());
     System.out.println("Square parameter is:"+s.parameter());
     System.out.println("__________________________________________________________");
     }
}