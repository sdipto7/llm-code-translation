
import java.util.Arrays;
import java.util.Scanner;

public class s913338871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int sum = 0;
        for (int i = N / 2; i < N; i++) {
            if (i % 2 == 1 || N % 2 == 0 && i == N / 2) {
                sum += a[i];
            }
        }
        if (N == 1) sum = a[0];
        System.out.println(sum);
    }
}

