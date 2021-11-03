import java.util.*;
class Armstrong
{
public static void main(String[] args)
{
int i,sum=0,t;
System.out.println("Enter number");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
t=n;
while(n>0)
{
i=n%10;
sum=sum+(i*i*i);
n=n/10;
}
if(sum==t)
{
System.out.println("Armstrong");
}
else
{
System.out.println("Not Armstrong");
}
}
}