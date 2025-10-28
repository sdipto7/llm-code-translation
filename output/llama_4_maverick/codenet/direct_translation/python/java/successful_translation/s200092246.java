
import java.util.Scanner;

public class s200092246 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] ans = new int[2];

        for (int i = 1; i <= N; i++) {
            if ((i * (i + 1)) / 2 < N) {
                continue;
            } else {
                ans[0] = i - 1;
                ans[1] = (i * (i + 1)) / 2 - N;
                break;
            }
        }
        for (int i = 0; i < ans[0] + 1; i++) {
            if (i + 1 != ans[1]) {
                System.out.println(i + 1);
            }
        }
    }
}

