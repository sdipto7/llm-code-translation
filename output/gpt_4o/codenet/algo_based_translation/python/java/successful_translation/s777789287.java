
import java.util.*;

public class s777789287 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        String result = checkCondition(n, m, a);
        System.out.println(result);
    }
    
    public static String checkCondition(int n, int m, int[] a) {
        Arrays.sort(a);
        
        // Reverse the sorted array
        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }
        
        double sum = 0;
        for (int value : a) {
            sum += value;
        }
        
        double s = sum / (4 * m);
        
        if (a[m - 1] >= s) {
            return "Yes";
        } else {
            return "No";
        }
    }
}

