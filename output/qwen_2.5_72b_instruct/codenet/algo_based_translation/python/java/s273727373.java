import java.util.Scanner;

public class s273727373 {
    public static void main(String[] args) {
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
        for (int num : B) {
            System.out.print(num + " ");
        }
    }
}
