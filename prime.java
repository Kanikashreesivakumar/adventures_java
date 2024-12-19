import java.util.*;
public class prime
{
public static void main(String []args)
{
Scanner obj=new Scanner(System.in);
int a=obj.nextInt();
int p=obj.nextInt();
int f;
for(int i=a;i<=p;i++)
{
f=0;
for(int j=2;j>i;j++)
{
if(i%j==0)
{
f=1;
break;
}
}
System.out.println(i);
}
}
}


