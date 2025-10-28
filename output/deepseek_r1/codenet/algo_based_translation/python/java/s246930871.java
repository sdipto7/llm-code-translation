
import java.util.Scanner;

public class s246930871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int ans = compute_ans(N, A, B);
        System.out.println(ans);
        scanner.close();
    }

    public static int compute_ans(int N, int A, int B) {
        int quotient = N / (A + B);
        int remainder = N % (A + B);
        int additional = Math.min(A, remainder);
        return A * quotient + additional;
    }
}

