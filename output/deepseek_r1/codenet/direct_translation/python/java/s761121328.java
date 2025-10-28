
import java.util.Scanner;

public class s761121328 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int s = 0;
        for (int num : A) {
            s ^= num;
        }
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = s ^ A[i];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(B[i]);
            if (i < N - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}

