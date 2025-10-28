
import java.util.Arrays;
import java.util.Scanner;

public class s763097776 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] p = new int[n];
        String[] parts = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(parts[i]);
        }
        int[] sorted = Arrays.copyOf(p, n);
        Arrays.sort(sorted);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (p[i] != sorted[i]) {
                count++;
            }
        }
        System.out.println((count == 0 || count == 2) ? "YES" : "NO");
    }
}

