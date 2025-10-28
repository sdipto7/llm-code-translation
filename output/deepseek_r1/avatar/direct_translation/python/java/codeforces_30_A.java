
import java.util.Scanner;

public class codeforces_30_A {
    public static String task4(int A, int B, int n) {
        for (int X = -1000; X <= 1000; X++) {
            long product;
            if (n == 0) {
                if (X == 0) continue;
                product = A;
            } else {
                if (X == 0) {
                    product = 0;
                } else {
                    int sign = (X < 0 && n % 2 != 0) ? -1 : 1;
                    long absX = Math.abs(X);
                    long power = 1;
                    for (int i = 0; i < n; i++) {
                        power *= absX;
                    }
                    product = A * power * sign;
                }
            }
            if (product == B) {
                return Integer.toString(X);
            }
        }
        return "No solution";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(task4(A, B, n));
        scanner.close();
    }
}

