//Interface
import java.util.*;
interface I1
{
void sub(int a,int b);
}
interface I2
{
void add(int a,int b);
}
class InterfaceEx implements I1,I2
{
public void sub(int a,int b)
{
int c=a-b;
System.out.println(c);
}
public void add(int a,int b)
{
int c=a+b;
System.out.println(c);
}
public static void main(String[] args)
{
System.out.println("Enter two numbers");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
InterfaceEx i=new InterfaceEx();
i.sub(a,b);
i.add(a,b);
}
}