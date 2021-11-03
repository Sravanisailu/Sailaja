class Copy
{
public static void main(String[] args)
{
int[] ori={15,18,19,24,23,01};
int[] copy=ori;
System.out.println("Original array is:");
for(int i=0;i<ori.length;i++)
{
System.out.println(ori[i]);
}
System.out.println("Copied array is:");
for(int i=0;i<copy.length;i++)
{
System.out.println(copy[i]);
}
}
}