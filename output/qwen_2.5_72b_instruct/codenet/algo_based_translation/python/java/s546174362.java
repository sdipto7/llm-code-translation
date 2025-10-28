import java.util.Scanner;
import java.util.Arrays;

public class s546174362 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        Arrays.sort(A);

        while (M > 0) {
            A[N - 1] /= 2;
            M--;
            int i = N - 2;
            while (M > 0 && i >= 0 && A[i] >= A[N - 1]) {
                A[i] /= 2;
                M--;
                i--;
            }
            Arrays.sort(A);
        }

        int sum = 0;
        for (int num : A) {
            sum += num;
        }
        System.out.println(sum);
    }
}
