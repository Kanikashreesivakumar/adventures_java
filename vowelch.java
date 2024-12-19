import java.util.*;
public class vowelch
{
public static void main(String []args)
{
Scanner object=new Scanner(System.in);
System.out.println("enter the string:");
String Str=object.nextline();
int vowelcount=0,  consonentcount=0 ,c=0;
for(int i=0;i<=c;i++)
{
char c=str.charAt(i);   
if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
{
vowelcount++;
}
else if ((c>='a' && c<='z')||(c>='a' && c<='z'))
{
consonentcount++;
}

else{
System.out.println("number of special character:"+c);
}
System.out.println("number of vowels:"+vowelcount);
System.out.println("number of consonents:"+consonentcount);
}
}
}