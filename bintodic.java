import java.util.*;
public class bintodic
{
    public static void main(String[] args){
    int n=101011,i=0,sum=0,r=0;
while(n>0) {
    r=n%10;
    sum=sum+r*(int)Math.pow(2,i++);
    n=n/10;
 }
System.out.print(sum);

}
 
}