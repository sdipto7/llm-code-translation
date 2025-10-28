
import java.util.Scanner;

public class s997947249 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        int result = calculateRemainder(N, K);
        System.out.println(result);
    }

    public static int calculateRemainder(int N, int K) {
        if (N % K == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}

