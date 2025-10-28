
import java.util.Scanner;

public class s200092246 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] ans = new int[2];
        for (int i = 1; i <= N; i++) {
            int sum_val = i * (i + 1) / 2;
            if (sum_val < N) {
                continue;
            } else {
                ans[0] = i - 1;
                ans[1] = sum_val - N;
                break;
            }
        }
        for (int j = 0; j <= ans[0]; j++) {
            int num = j + 1;
            if (num != ans[1]) {
                System.out.println(num);
            }
        }
    }
}

