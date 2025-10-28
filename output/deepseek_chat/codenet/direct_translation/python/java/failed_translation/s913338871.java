
import java.util.Arrays;
import java.util.Scanner;

public class s913338871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[2 * N];
        for (int i = 0; i < 2 * N; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int sum = 0;
        for (int i = N; i < 2 * N; i += 2) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}

