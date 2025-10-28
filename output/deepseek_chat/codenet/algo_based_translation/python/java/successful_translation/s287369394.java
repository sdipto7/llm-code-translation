
import java.util.Scanner;

public class s287369394 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        
        int[] A = new int[N + 1];
        int[] B = new int[N];
        
        String[] aInput = scanner.nextLine().split(" ");
        String[] bInput = scanner.nextLine().split(" ");
        
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(aInput[i]);
            B[i] = Integer.parseInt(bInput[i]);
        }
        A[N] = Integer.parseInt(aInput[N]);
        
        int ans = 0;
        
        for (int i = 0; i < N; i++) {
            int d = Math.min(A[i], B[i]);
            ans += d;
            A[i] -= d;
            B[i] -= d;
            
            d = Math.min(A[i + 1], B[i]);
            ans += d;
            A[i + 1] -= d;
            B[i] -= d;
        }
        
        System.out.println(ans);
    }
}

