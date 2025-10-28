
import java.util.*;

public class s846046431 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Integer[] A = new Integer[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A, Collections.reverseOrder());
        long S = 0;
        for (int num : A) {
            S += num;
        }
        boolean ok = true;
        for (int i = 0; i < M; i++) {
            if ((long) A[i] * 4 * M < S) {
                ok = false;
                break;
            }
        }
        System.out.println(ok ? "Yes" : "No");
    }
}

