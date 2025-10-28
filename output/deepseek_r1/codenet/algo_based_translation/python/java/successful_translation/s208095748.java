
import java.util.Scanner;

public class s208095748 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int result = calculate_result(A, B, C);
        System.out.println(result);
        scanner.close();
    }

    public static int calculate_result(int A, int B, int C) {
        if (B < C) {
            return 0;
        } else if (A * C < B) {
            return C;
        } else {
            return B / A;
        }
    }
}

