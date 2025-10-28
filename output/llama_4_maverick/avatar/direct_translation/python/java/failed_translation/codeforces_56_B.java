
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_56_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int mn = N, mx = -1;
        for (int i = 0; i < N; i++) {
            if (i + 1 != A[i]) {
                mn = Math.min(mn, i);
                mx = Math.max(mx, i);
            }
        }
        if (mx == -1) {
            System.out.println("0 0");
        } else {
            int[] temp = new int[mx - mn + 1];
            int j = 0;
            for (int i = mx; i >= mn; i--) {
                temp[j++] = A[i];
            }
            j = 0;
            for (int i = mn; i <= mx; i++) {
                A[i] = temp[j++];
            }
            Arrays.sort(A);
            int[] B = Arrays.copyOf(A, N);
            Arrays.sort(B);
            boolean isEqual = true;
            for (int i = 0; i < N; i++) {
                if (A[i] != B[i]) {
                    isEqual = false;
                    break;
                }
            }
            if (isEqual) {
                System.out.println((mn + 1) + " " + (mx + 1));
            } else {
                System.out.println("0 0");
            }
        }
    }
}

