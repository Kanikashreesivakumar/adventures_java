import java.util.*;
public class palindrom
{
public static void main(String []args)
{
Scanner obj=new Scanner(System.in);
int n=obj.nextInt();
int d=n;
int d1=n;
int sum=0;
int nd=0;
while(n>0)
{
n/=10;
nd++;
}
while(d>0)
{
int r=1;
int b=d%10;
for(int i=1;i<=nd;i++)
{
r=r*b;
}
sum=sum+r;
}
d=d/10;
{
System.out.println((d1==sum)?"yes it is palindrom":"no it is't palindrom");
}
}
}

