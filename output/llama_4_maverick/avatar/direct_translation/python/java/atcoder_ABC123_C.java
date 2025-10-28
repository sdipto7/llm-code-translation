
import java.util.Scanner;

public class atcoder_ABC123_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[5];
        for (int i = 0; i < 5; i++) {
            A[i] = sc.nextInt();
        }
        int min = A[0];
        for (int i = 1; i < 5; i++) {
            if (A[i] < min) {
                min = A[i];
            }
        }
        System.out.println((int) Math.ceil((double) N / min) + 4);
    }
}

