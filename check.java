import java.util.*;
public class check
{
public static void main(String []args)
{
Scanner object=new Scanner(System.in);
System.out.println("enter the number");
double number=object.nextDouble();
if(number%2==0)
{
System.out.println("the given number is even");
}
else 
{
System.out.println("the given number is odd");
}
}
}