
import java.util.Scanner;

public class atcoder_AGC010_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }
        
        long sumA = 0;
        for (long num : a) {
            sumA += num;
        }
        
        long denominator = (long) n * (n + 1) / 2;
        if (sumA % denominator != 0) {
            System.out.println("NO");
            return;
        }
        
        long k = sumA / denominator;
        long[] extendedA = new long[n + 1];
        System.arraycopy(a, 0, extendedA, 0, n);
        extendedA[n] = a[0];
        a = extendedA;
        
        long sumMod = 0;
        int countNonNeg = 0;
        for (int i = 0; i < n; i++) {
            long previous = a[i];
            long current = a[i + 1];
            long delta = k - previous + current;
            sumMod += delta % n;
            if (delta >= 0) {
                countNonNeg++;
            }
        }
        
        if (sumMod != 0 || countNonNeg != n) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}

