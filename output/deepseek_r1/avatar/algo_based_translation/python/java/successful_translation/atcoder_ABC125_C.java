
import java.util.Scanner;

public class atcoder_ABC125_C {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        int remainder = a % b;
        if (remainder < 0) {
            remainder += Math.abs(b);
        }
        return gcd(b, remainder);
    }

    public static int[][] ruisekiLr(int[] array) {
        int n = array.length;
        int[] left = new int[n + 1];
        int[] right = new int[n + 1];
        
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
        scanner.close();
        
        int[][] lr = ruisekiLr(a);
        int[] left = lr[0];
        int[] right = lr[1];
        
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int currentGcd = gcd(left[i], right[i + 1]);
            if (currentGcd > ans) {
                ans = currentGcd;
            }
        }
        
        System.out.println(ans);
    }
}

