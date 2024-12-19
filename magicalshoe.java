import java.util.Scanner;

public class shoe
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int q = scanner.nextInt();
        StringBuilder result = new StringBuilder();
         for (int i = 0; i < q; i++) {
            long a = scanner.nextLong(); 
            long b = scanner.nextLong();            
            long n = scanner.nextLong();            
            long S = scanner.nextLong(); 
         long maxNCoins = Math.min(a, S / n);
          long remainder = S - maxNCoins * n;
            if (remainder <= b) {
                result.append("YES\n");
            } else {
                result.append("NO\n");
            }
        }
        
               System.out.print(result);
         }
}