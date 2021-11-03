//Method Overriding
import java.util.*;
class Uni_rules
{
void attendance(int a)
{
if(a>=75)
{
System.out.println("Eligible");
}
else
{
System.out.println("Not Eligible");
}
}
void result(int m)
{
if(m>=40)
{
System.out.println("Pass");
}
else
{
System.out.println("Fail");
}
}
}
class Clg_rules extends Uni_rules
{
void attendance(int a)
{
if(a>=80)
{
System.out.println("Eligible");
}
else
{
System.out.println("Not Eligible");
}
}
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
Clg_rules c=new Clg_rules();
System.out.println("Enter your attendance");
int a=s.nextInt();
c.attendance(a);
System.out.println("Enter your result");
int m=s.nextInt();
c.result(m);
}
}