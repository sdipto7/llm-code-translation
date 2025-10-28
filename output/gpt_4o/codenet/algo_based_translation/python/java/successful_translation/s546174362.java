
import java.util.Arrays;
import java.util.Scanner;

public class s546174362 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.println(processNumbers(N, M, A));

        scanner.close();
    }

    public static int processNumbers(int N, int M, int[] A) {
        Arrays.sort(A);

        while (M > 0) {
            A[A.length - 1] /= 2;
            M--;
            int i = -2;
            while (M > 0 && i >= -N && A[A.length + i] >= A[A.length - 1]) {
                A[A.length + i] /= 2;
                M--;
                i--;
            }
            Arrays.sort(A);
        }

        int sum = 0;
        for (int num : A) {
            sum += num;
        }

        return sum;
    }
}

