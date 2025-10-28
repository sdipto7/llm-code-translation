
import java.util.Scanner;

public class codeforces_30_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int n = scanner.nextInt();
        Object result = task4(A, B, n);
        System.out.println(result);
    }

    public static Object task4(int A, int B, int n) {
        for (int X = -1000; X <= 1000; X++) {
            if (X == 0 && n == 0) {
                continue;
            }
            double xToN = Math.pow(X, n);
            if (A * xToN == B) {
                return X;
            }
        }
        return "No solution";
    }
}

