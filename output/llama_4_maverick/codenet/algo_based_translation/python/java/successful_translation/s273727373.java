
import java.util.Scanner;

public class s273727373 {
    public static void main(String[] args) {
        rearrangeArray();
    }

    public static void rearrangeArray() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int[] B = A.clone();
        int count = 1;
        for (int i : A) {
            B[i - 1] = count;
            count++;
        }
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i]);
            if (i < B.length - 1) {
                System.out.print(" ");
            }
        }
        scanner.close();
    }
}

