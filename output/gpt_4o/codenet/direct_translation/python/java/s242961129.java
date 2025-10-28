
import java.util.Scanner;

public class s242961129 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split(" ");
        int[] A = new int[N + 2];
        for (int i = 0; i < N; i++) {
            A[i + 1] = Integer.parseInt(input[i]);
        }
        A[0] = 0;
        A[N + 1] = 0;
        int ans = Math.abs(A[N + 1]);
        int[] diff = new int[N];
        for (int i = 1; i <= N; i++) {
            int dif = Math.abs(A[i] - A[i - 1]) + Math.abs(A[i] - A[i + 1]) - Math.abs(A[i - 1] - A[i + 1]);
            ans += Math.abs(A[i] - A[i - 1]);
            diff[i - 1] = dif;
        }
        for (int i = 0; i < N; i++) {
            System.out.println(ans - diff[i]);
        }
    }
}

