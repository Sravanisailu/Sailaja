//constructor overloading
import java.util.*;
class Perimeter
{
Perimeter(double r)
{
System.out.println("Circle Perimeter:"+2*3.14*r);
}
Perimeter(int side)
{
System.out.println("Square Perimeter:"+4*side);
}
Perimeter(int l,int b)
{
System.out.println("Rectangle Perimeter:"+2*l*b);
}
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter radius");
double r=s.nextDouble();
Perimeter circle=new Perimeter(r);
System.out.println("Enter side");
int side=s.nextInt();
Perimeter square=new Perimeter(side);
System.out.println("Enter length and breadth");
int l=s.nextInt();
int b=s.nextInt();
Perimeter rectangle=new Perimeter(l,b);
}
}