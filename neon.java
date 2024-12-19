import java.util.*;
public class neon
{
public static void main(String []args)
{
Scanner obj=new Scanner(System.in);
int n=obj.nextInt(),sqr=n*n,r=0;
for(;sqr>0;r=r+(sqr%10),sqr/=10);
System.out.println((n==r)?"yes it's":"no it isn't");
}
}

