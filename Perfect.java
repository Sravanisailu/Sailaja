import java.util.*;
class Perfect
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
int n=s.nextInt();
int sum=0;
if(n>0)
{
for(int i=1;i<n;i++)
{
if(n%i==0)
{
sum=sum+i;
}
}
if(sum==n)
{
System.out.println("Given number is Perfect Number");
}
else
{
System.out.println("Given number is not a Perfect Number");
}
}
}
}
