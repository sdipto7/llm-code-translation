
import java.util.Scanner;

public class s357377130 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int K = scanner.nextInt();

        if (A + K - 1 >= B - K + 1) {
            for (int i = A; i <= B; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = 0; i < K; i++) {
                System.out.println(A + i);
            }
            for (int i = 0; i < K; i++) {
                System.out.println(B - K + 1 + i);
            }
        }
    }
}

