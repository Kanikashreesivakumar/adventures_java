import java.util.Scanner;
class Date{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int max=0;
        System.out.println("Enter Date: ");
        int Date=obj.nextInt();
        System.out.println("Enter Month: ");
        int Month=obj.nextInt();
        System.out.println("Enter Year: ");
        int Year=obj.nextInt();
        if((Month>=1&&Month<=12)&&(Year>0)){
            switch (Month) {
                case 1,3,5,7,8,10,12:
                    max=31;
                    break;
                case 4,6,9,11:
                    max=30;
                    break;
            }
            if(Date>=1&&Date<=max){
                System.out.println(Date+"/"+Month+"/"+Year+" is a valid date");
            }
            else{
                System.out.println(Date+"/"+Month+"/"+Year+" is a Invalid date");
            }
        }
        else{
            System.out.println(Date+"/"+Month+"/"+Year+" is a Invalid date");
        }
    }
}