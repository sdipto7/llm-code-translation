
import java.util.Arrays;
import java.util.Scanner;

public class s546174362 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line1 = scanner.nextLine().split(" ");
        int N = Integer.parseInt(line1[0]);
        int M = Integer.parseInt(line1[1]);

        String[] line2 = scanner.nextLine().split(" ");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(line2[i]);
        }
        Arrays.sort(A);

        while (M > 0) {
            A[N - 1] /= 2;
            M -= 1;
            int i = N - 2;
            while (M > 0 && i >= 0 && A[i] >= A[N - 1]) {
                A[i] /= 2;
                M -= 1;
                i -= 1;
            }
            Arrays.sort(A);
        }

        int sumA = 0;
        for (int num : A) {
            sumA += num;
        }
        System.out.println(sumA);
    }
}

