
import java.util.Scanner;
import java.lang.Math;

public class atcoder_ABC123_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[5];
        for (int i = 0; i < 5; i++) {
            A[i] = scanner.nextInt();
        }
        int minValue = A[0];
        for (int i = 1; i < 5; i++) {
            if (A[i] < minValue) {
                minValue = A[i];
            }
        }
        int result = (int) Math.ceil((double) N / minValue) + 4;
        System.out.println(result);
    }
}

