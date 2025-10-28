
import java.util.Scanner;

public class codeforces_612_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] a = new int[n];
        String[] parts = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(parts[i]);
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[a[i] - 1] = i;
        }
        long sum = 0;
        for (int i = 1; i < n; i++) {
            sum += Math.abs(b[i] - b[i - 1]);
        }
        System.out.println(sum);
    }
}

