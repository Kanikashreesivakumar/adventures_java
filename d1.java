import java.util.*;

public class D1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
                int n = obj.nextInt();
        
                int a[] = new int[n];
        
                for (int i = 0; i < n; i++) {
            a[i] = obj.nextInt();
        }
        
        
        Arrays.sort(a);
        
                for (int k = n - 1; k >= 0; k--) {
            System.out.print(a[k] + " ");
        }
        
                  }
}