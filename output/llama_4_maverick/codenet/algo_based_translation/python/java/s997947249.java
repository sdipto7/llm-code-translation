
import java.util.Scanner;

public class s997947249 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        System.out.println(remainderCheck(N, K));
    }

    public static int remainderCheck(int N, int K) {
        if (N % K == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}

