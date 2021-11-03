//Method Overloading
import java.util.*;
class Mo
{
void area(double r)
{
System.out.println("Area of circle:"+3.14*r*r);
}
void area(int a)
{
System.out.println("Area of square:"+a*a);
}
void area(int l,int b)
{
System.out.println("Area of rectangle:"+l*b);
}
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter radius of circle");
double r=s.nextDouble();
System.out.println("Enter side of square");
int a=s.nextInt();
System.out.println("Enter length and breadth of rectangle");
int l=s.nextInt();
int b=s.nextInt();
Mo m=new Mo();
m.area(r);
m.area(a);
m.area(l,b);
}
}
