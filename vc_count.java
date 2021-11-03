class Countvc
{
public static void main(String[] args) 
{    
int vc=0, cc=0; 
String s="I like Choclates";
s=s.toLowerCase();
for(int i=0;i<s.length();i++) 
{    
if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') 
{    
vc++;
}
else if(s.charAt(i)>='a'&&s.charAt(i)<='z') 
{      
cc++; 
} 
}
System.out.println("Number of vowels: "+vc);    
System.out.println("Number of consonants: "+cc);    
}    
}   