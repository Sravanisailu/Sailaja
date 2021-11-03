//string reverse
class Reverse   
{    
public static void main(String[] args) 
{
String s="Sravani";    
String rs="";
for(int i=s.length()-1;i>=0;i--)
{
rs=rs+s.charAt(i); 
}
System.out.println("Original string: "+s); 
System.out.println("Reverse of given string: "+rs);    
}    
}    