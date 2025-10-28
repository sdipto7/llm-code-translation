
import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC125_C {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    public static int[][] ruiseki_lr(int[] array) {
        int e = 0;
        int n = array.length;
        int[] left = new int[n + 1];
        int[] right = new int[n + 1];
        Arrays.fill(left, e);
        Arrays.fill(right, e);
        
        for (int i = 0; i < n; i++) {
            left[i + 1] = gcd(left[i], array[i]);
        }
        
        for (int i = n - 1; i >= 0; i--) {
            right[i] = gcd(right[i + 1], array[i]);
        }
        
        return new int[][]{left, right};
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        int[][] result = ruiseki_lr(a);
        int[] left = result[0];
        int[] right = result[1];
        int ans = 0;
        
        for (int i = 0; i < n; i++) {
            int current = gcd(left[i], right[i + 1]);
            ans = Math.max(ans, current);
        }
        
        System.out.println(ans);
        scanner.close();
    }
}

