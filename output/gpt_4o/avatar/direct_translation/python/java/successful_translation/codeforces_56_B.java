
import java.util.*;

public class codeforces_56_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int mn = N + 1, mx = -1;
        for (int i = 0; i < N; i++) {
            if (i + 1 != A[i]) {
                mn = Math.min(mn, i);
                mx = Math.max(mx, i);
            }
        }
        if (mx == -1) {
            System.out.println("0 0");
        } else {
            int[] B = new int[N];
            System.arraycopy(A, 0, B, 0, mn);
            for (int i = mn; i <= mx; i++) {
                B[i] = A[mx - (i - mn)];
            }
            System.arraycopy(A, mx + 1, B, mx + 1, N - (mx + 1));
            if (isSorted(B)) {
                System.out.println((mn + 1) + " " + (mx + 1));
            } else {
                System.out.println("0 0");
            }
        }
        sc.close();
    }

    private static boolean isSorted(int[] A) {
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] > A[i]) {
                return false;
            }
        }
        return true;
    }
}

