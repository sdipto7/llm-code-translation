import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC123_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[5];
        for (int i = 0; i < 5; i++) {
            A[i] = scanner.nextInt();
        }
        int minA = Arrays.stream(A).min().getAsInt();
        System.out.println((int) Math.ceil((double) N / minA) + 4);
    }
}
