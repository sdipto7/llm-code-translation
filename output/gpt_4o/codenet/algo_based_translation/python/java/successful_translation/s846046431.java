
import java.util.*;

public class s846046431 {

    public static String isQualifying(int N, int M, int[] A) {
        int S = 0;
        for (int number : A) {
            S += number;
        }
        
        Arrays.sort(A);
        
        for (int i = N - 1; i >= N - M; i--) {
            if ((A[i] / (double) S) - (1 / (4.0 * M)) < 0) {
                return "No";
            }
        }
        
        return "Yes";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        
        System.out.println(isQualifying(N, M, A));
        
        sc.close();
    }
}

