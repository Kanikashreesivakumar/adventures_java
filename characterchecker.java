import java.util.*;
public class  characterchecker
{
public static void main(String []args)
{
Scanner object=new Scanner(System.in);
System.out.println("enter the character:");
char ch=object.next().charAt(0);
if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
{
System.out.println(ch+"is alphabet");
}
else if(ch>='0' && ch<='9')
{
System.out.println(ch+"is a digit");
}
else 
{
System.out.println(ch+"is a special character");
}
}
}