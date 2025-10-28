
import java.util.Scanner;

public class s357377130 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int A = Integer.parseInt(inputs[0]);
        int B = Integer.parseInt(inputs[1]);
        int K = Integer.parseInt(inputs[2]);
        processInput(A, B, K);
    }

    public static void processInput(int A, int B, int K) {
        if (A + K - 1 >= B - K + 1) {
            while (A <= B) {
                System.out.println(A);
                A += 1;
            }
        } else {
            int i = 0;
            while (i <= K - 1) {
                System.out.println(A + i);
                i += 1;
            }
            int tempK = K;
            while (B - tempK + 1 <= B) {
                System.out.println(B - tempK + 1);
                tempK -= 1;
            }
        }
    }
}

