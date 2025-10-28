
import java.util.Scanner;

public class s246930871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int quotient = N / (A + B);
        int remainder = N % (A + B);
        int ans = quotient * A + Math.min(A, remainder);
        System.out.println(ans);
    }
}

