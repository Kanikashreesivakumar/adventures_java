import java.util.*; 
public class a1
{
public static void main(String []args)
{
Scanner obj=new Scanner(System.in);
int n=obj.nextInt();
int  a[]=new int[n],sqrt;
for(int i=0;i<n;i++)
{
a[i]=obj.nextInt();
}
for(int i=0;i<n;i++)
{
int sqt=(int)Math.sqrt(a[1]);
if(sqt*sqt==a[i])
{
System.out.println(a[i]);
}
}
}
}