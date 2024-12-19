import java.util.Scanner;
class noodle{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter No of Rounds:");
        int n=obj.nextInt();
        int cut=0;
       while(n>0)
{
n=n/2;
c++;        }
        System.out.println("Cutting count is : "+cut-1);
    }
}