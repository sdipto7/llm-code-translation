



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
            int[] temp = new int[N];
            System.arraycopy(A, 0, temp, 0, mn);
            for (int i = mx; i >= mn; i--) {
                temp[mn + mx - i] = A[i];
            }
            System.arraycopy(A, mx + 1, temp, mx + 1, N - mx - 1);
            Arrays.sort(A);
            if (Arrays.equals(temp, A)) {
                System.out.println((mn + 1) + " " + (mx + 1));
            } else {
                System.out.println("0 0");
            }
        }
    }
}
