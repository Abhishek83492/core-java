class Point2D
{
private float x=0.0f;
private float y=0.0f;
Point2D()
{
}
Point2D(float x,float y)
{
this.x=x;
this.y=y;
}
public void setX(float x)
{
this.x=x;
}
public void setY(float y)
{
this.y=y;
}
public void setXY(float x,float y)
{
this.x=x;
this.y=y;
}
public float getX()
{
return x;
}
public float getY()
{
return y;
}
public float[] getXY()
{
return new float[]{this.x,this.y};   //return arrays..
// float[] a =  {this.x ,this.y};
// return a;

}
public String toString()
{
return "(x:"+x+"y:"+y+")";
}
}
class Point3D extends Point2D
{
private float z=0.0f;
public Point3D(float x,float y, float z)
{
super(x,y);
this.z=z;
}
public Point3D()
{  }
public void setZ(float z)
{
this.z=z;
}
public float getZ()
{
return z;
}
public void setXYZ(float x,float y,float z)
{
super.getXY();
this.z=z;
}
/*public float[] getXYZ()
{

float[] {super.getXY(),this.z};   //return arrays..
}*/
public String toString()
{
return "("+super.toString()+z+")";
}
}

class TestPoint2D  //main
{
public static void main(String args[])
{
Point3D p3=new Point3D (2.0f,3.0f,4.0f);
System.out.println(p3);
p3.setXY(4.0f,5.0f);
System.out.println("x is:"+p3.getXY()[0]);    
System.out.println("y is:"+p3.getXY()[1]);
//p3.setXYZ(4.0f,5.0f,2.0f);
//System.out.println("x is:"+p3.getXYZ()[0]);    
//System.out.println("y is:"+p3.getXYZ()[1]);

}
}