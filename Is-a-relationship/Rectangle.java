class Rectangle extends Shape
{
       float length;
       float breadth;
       
      Rectangle(){};
      void setLength(float length)
      {
          this.length=length;
      }
      void setBreadth(float breadth)
      {
           this.breadth=breadth;
      }
      float getLength()
      {
          return length;
      }
      float getBreadth()
      {
          return breadth;
      }
      float area()
      {
          return length*breadth;
      }
      float perameter()
      {
          return 2*length+breadth;
      }
 }     
       
            
       