
import java.util.Scanner;

public class atcoder_ABC123_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[5];
        for (int i = 0; i < 5; i++) {
            A[i] = sc.nextInt();
        }
        int minA = A[0];
        for (int num : A) {
            if (num < minA) {
                minA = num;
            }
        }
        System.out.println((N + minA - 1) / minA + 4);
    }
}

