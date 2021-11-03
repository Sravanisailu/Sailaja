import java.util.*;
class Ls
{
public static void main(String[] args)
{
int[] A={15,18,19,24,23,01};
System.out.println("Enter key");
Scanner s=new Scanner(System.in);
int key=s.nextInt();
Ls l=new Ls();
int pos=l.search(A,key);
if(pos==-1)
{
System.out.println("Key not found");
}
else
{
System.out.println("pos="+pos+1);
}
}
int search(int[] A,int key)
{
for(int i=0;i<A.length;i++)
{
if(key==A[i])
return i;
}
return -1;
}
}