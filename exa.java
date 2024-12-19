import java.util.*;
public class exa
{
public static void main(String []args)
{
Scanner object=new Scanner(System.in);
System.out.println("enter the number:");
double num=object.nextDouble();
int f=0;
for(int i=2;i<num;i++)
{
if(num%i==0)
{
f=1;
break;
}
}
{
System.out.println((f==1)?"not prime":"prime");
}
}
}
