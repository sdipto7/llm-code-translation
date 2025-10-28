
import java.util.Scanner;

public class s246930871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int A = Integer.parseInt(input[1]);
        int B = Integer.parseInt(input[2]);
        System.out.println(calculate_result(N, A, B));
    }

    public static int calculate_result(int N, int A, int B) {
        int quotient = N / (A + B);
        int remainder = N % (A + B);
        int partial_sum = A * quotient;
        int additional_sum = Math.min(A, remainder);
        int ans = partial_sum + additional_sum;
        return ans;
    }
}

