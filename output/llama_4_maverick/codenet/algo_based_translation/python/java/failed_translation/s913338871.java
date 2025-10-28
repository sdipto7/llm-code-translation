
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
        int[] s = new int[(N + 1) / 2];
        int j = 0;
        for (int i = N; i < a.length; i += 2) {
            s[j++] = a[i];
        }
        int sum_s = 0;
        for (int i = 0; i < s.length; i++) {
            sum_s += s[i];
        }
        System.out.println(sum_s);
        scanner.close();
    }
}

