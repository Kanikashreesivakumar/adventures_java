import java.util.*;
public class fac1
{
public static void main(String []args)
{
Scanner obj=new Scanner(System.in);
int a=obj.nextInt();
int p=obj.nextInt();
int r=1;
for(int i=1;i<=p;i++)
{
r=r*a;
}
System.out.println(r);
}
}

