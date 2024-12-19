import java.util.*;
public class celsius
{
public static void main(String []args)
{
Scanner object=new Scanner(System.in);
System.out.println("enter the temperature in fahrenheit:");
double fahrenheit=object.nextDouble();
double celsius=(fahrenheit-32)*5/9;
System.out.println("temperature in celsius is;"+celsius);

}
}
