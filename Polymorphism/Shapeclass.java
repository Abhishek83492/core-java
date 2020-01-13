abstract class Shapeclass
{
       String color;
       double pie = 3.14;
       Shapeclass(String color)
       {
             this.color=color;
       }
       abstract void area();
       abstract void perameter();
}
class Circle extends Shapeclass
{
        double radius;
       // double pie = 3.14;
       Circle(String color,double radius)
       {
              super(color);
              this.radius=radius;
        }
       void area()
        {
            System.out.println("area is:"+pie*radius*radius);
        }
        void perameter()
        {
                System.out.println("perameter is:"+2*pie*radius);
        }
 }
class Test 
{
       public static void main(String[] args)throw Exception 
        {
            Circle c[] = new Circle[3];
            c[0]= new Circle("red",22.5);
            c[1]= new Circle("white",25.5);
            c[2]= new Circle("pink",26.5);
            System.out.println("Array is"+c[3]);
           
            for(int i = 0;i<3;i++)
            {
                 c[i].area();
                 c[i].perameter();
            }
        }
} 
          