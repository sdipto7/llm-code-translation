
import java.util.*;

public class s846046431 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] firstLine = sc.nextLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);
        String[] aLine = sc.nextLine().split(" ");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(aLine[i]);
        }
        Arrays.sort(A);
        for (int i = 0; i < A.length / 2; i++) {
            int temp = A[i];
            A[i] = A[A.length - 1 - i];
            A[A.length - 1 - i] = temp;
        }
        int S = 0;
        for (int num : A) {
            S += num;
        }
        for (int i = 0; i < M; i++) {
            int a = A[i];
            if ((double) a / S < 1.0 / (4 * M)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}

