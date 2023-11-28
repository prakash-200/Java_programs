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
public class class-obj
{
    public static void main(String args[])
    {
        Rectangle sj1=new Rectangle();
        sj1.length=10;
        sj1.width=20;
        sj1.area();
        System.out.print("Area of Rectangle:"+sj1.area());
    }
}