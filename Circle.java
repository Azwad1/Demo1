class Circle
{
int radius;
void insert(int r)
{
radius=r;
}
void calculateArea()
{
System.out.println(2*3.14*radius*radius);
}
}
class Circle1
{
public static void main(String args[])
{
Circle c1=new Circle();
Circle c2=new Circle();
c1.insert(11);
c2.insert(6);
c1.calculateArea();
c2.calculateArea();
}
}