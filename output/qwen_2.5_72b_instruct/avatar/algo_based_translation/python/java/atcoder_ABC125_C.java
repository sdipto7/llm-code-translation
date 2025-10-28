
import java.util.Scanner;

public class atcoder_ABC125_C {
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
            ans = Math.max(gcd(left[i], right[i + 1]), ans);
        }
        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int[][] ruiseki_lr(int[] array) {
        java.util.function.BiFunction<Integer, Integer, Integer> op = (a, b) -> gcd(a, b);
        int e = 0;
        int n = array.length;
        int[] left = new int[n + 1];
        int[] right = new int[n + 1];
        for (int i = 0; i < n; i++) {
            left[i + 1] = op.apply(left[i], array[i]);
        }
        for (int i = n - 1; i >= 0; i--) {
            right[i] = op.apply(right[i + 1], array[i]);
        }
        return new int[][]{left, right};
    }
}

