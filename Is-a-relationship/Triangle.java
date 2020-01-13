class Triangle extends Shape
{
     float height;
     float base;
     float length;
   
    Triangle() {};
    void setHeight(float height)
    {
        this.height=height;
    }
    void setBase(float base)
    {
         this.base=base;
    }
    void setLength(float length)
    {
         this.length=length;
    }
    float getHeight()
    {
         return height;
    }
    float getLength()
    {
         return length;
    }
    float getBase()
    {
         return base;
    }
    float parameter()
    {
        return height+base+length;
    }
    float area()
    {
        return height+base+length/2;
    }
}
 