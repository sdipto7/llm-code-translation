
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        Integer[][] A = new Integer[N][2];
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i][0] = i + 1;
            A[i][1] = Integer.parseInt(input[i]);
        }
        Arrays.sort(A, Comparator.comparingInt(a -> a[1]));
        int[] A_ = new int[N];
        for (int i = 0; i < N; i++) {
            A_[i] = A[i][0];
        }
        for (int i = 0; i < N - 1; i++) {
            System.out.print(A_[i] + " ");
        }
        System.out.println(A_[N - 1]);
    }
}

