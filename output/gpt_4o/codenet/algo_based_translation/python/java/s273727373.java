
import java.util.Scanner;

public class s273727373 {

    public static void main(String[] args) {
        processNumbers();
    }

    public static void processNumbers() {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        
        System.arraycopy(A, 0, B, 0, N);
        
        int count = 1;
        for (int i = 0; i < N; i++) {
            B[A[i] - 1] = count;
            count++;
        }
        
        for (int i = 0; i < N; i++) {
            System.out.print(B[i] + " ");
        }
    }
}

