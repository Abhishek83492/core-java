class Square extends Shape
{
   float side;
   
   Square() {};
   
   void setSide(float side)
   {
        this.side=side;
   }
   float getSide()
   {
         return side;
   }
   float area()
   {
        return side*side;
   }
   float parameter()
   {
        return 2*side;
   }
}   
  