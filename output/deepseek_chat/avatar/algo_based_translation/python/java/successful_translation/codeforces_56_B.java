
import java.util.*;

public class codeforces_56_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        
        int mn = N + 1;
        int mx = -1;
        
        for (int i = 0; i < N; i++) {
            if (i + 1 != A[i]) {
                mn = Math.min(mn, i);
                mx = Math.max(mx, i);
            }
        }
        
        if (mx == -1) {
            System.out.println("0 0");
        } else {
            int[] newA = new int[N];
            int index = 0;
            
            for (int i = 0; i < mn; i++) {
                newA[index++] = A[i];
            }
            
            for (int i = mx; i >= mn; i--) {
                newA[index++] = A[i];
            }
            
            for (int i = mx + 1; i < N; i++) {
                newA[index++] = A[i];
            }
            
            boolean isSorted = true;
            for (int i = 0; i < N - 1; i++) {
                if (newA[i] > newA[i + 1]) {
                    isSorted = false;
                    break;
                }
            }
            
            if (isSorted) {
                System.out.println((mn + 1) + " " + (mx + 1));
            } else {
                System.out.println("0 0");
            }
        }
    }
}

