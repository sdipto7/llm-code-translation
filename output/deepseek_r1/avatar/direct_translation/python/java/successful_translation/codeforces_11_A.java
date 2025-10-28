
import java.util.Scanner;

public class codeforces_11_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.nextLine();
        int[] x = new int[n];
        String[] input = scanner.nextLine().trim().split(" ");
        for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(input[i]);
        }
        long m = 0;
        for (int a = 0; a < n - 1; a++) {
            if (x[a] >= x[a + 1]) {
                int q = (x[a] - x[a + 1]) / d + 1;
                m += q;
                x[a + 1] += q * d;
            }
        }
        System.out.println(m);
    }
}

