
import java.util.Scanner;

public class s246930871 {
    public static int calculateStones(int N, int A, int B) {
        int ans = A * (N / (A + B)) + Math.min(A, N % (A + B));
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();
        int result = calculateStones(N, A, B);
        System.out.println(result);
    }
}

