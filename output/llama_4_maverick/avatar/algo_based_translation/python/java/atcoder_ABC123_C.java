
import java.util.Scanner;

public class atcoder_ABC123_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[5];
        for (int i = 0; i < 5; i++) {
            A[i] = scanner.nextInt();
        }
        int min = A[0];
        for (int i = 1; i < 5; i++) {
            if (A[i] < min) {
                min = A[i];
            }
        }
        int result = (int) Math.ceil((double) N / min) + 4;
        System.out.println(result);
    }
}

