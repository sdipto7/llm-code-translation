import java.util.Arrays;
import java.util.Scanner;

public class s913338871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[scanner.nextInt()];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int[] s = new int[(a.length - N + 1) / 2];
        for (int i = 0; i < s.length; i++) {
            s[i] = a[N + i * 2];
        }
        int sum = 0;
        for (int value : s) {
            sum += value;
        }
        System.out.println(sum);
    }
}
