
import java.util.Scanner;

public class s273727373 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int[] B = new int[N];
        System.arraycopy(A, 0, B, 0, N);
        int count = 1;
        for (int i : A) {
            B[i - 1] = count++;
        }
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i]);
            if (i != B.length - 1) {
                System.out.print(" ");
            }
        }
    }
}

