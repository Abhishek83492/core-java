class Circle extends Shape
{
    float radius;
    Circle() {};
    
    void setRadius(float radius)
     {
          this.radius=radius;
      }
     float getRadius()
     {
         return radius;
     }
     float diameter()
     {
         return 2*radius;
     }
     float area()
     {
        return pi*radius*radius;
     }
     float circumfrance()
     {
        return 2*pi*radius;
     }
}
       