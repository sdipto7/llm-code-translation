import java.util.Scanner;

public class s923405856 {
    public static void max_subarray_sum() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            int res = Integer.MIN_VALUE;
            int s = 0;
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                s = Math.max(s + a, a);
                res = Math.max(s, res);
            }
            System.out.println(res);
        }
        scanner.close();
    }

    public static void main(String[] args) {
        max_subarray_sum();
    }
}
