//class & object in java

class Rectangle
{
    int length,width;
    void getDetails(int x,int y)
    {
    length=x;
    width=y;
    }

   int area()
  {
    int a=length*width;
    return a;
  }
}
public class prabh
{
    public static void main(String args[])
    {
        Rectangle o1=new Rectangle();
        o1.length=10;
        o1.width=20;
        o1.area();
        System.out.print("Area of Rectangle:"+o1.area());
    }
}