
import java.util.Scanner;

public class atcoder_AGC010_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // consume the leftover newline
        String[] input = scanner.nextLine().split(" ");
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(input[i]);
        }

        int sumA = 0;
        for (int num : a) {
            sumA += num;
        }

        if (sumA % (n * (n + 1) / 2) != 0) {
            System.out.println("NO");
        } else {
            double k = sumA / (double) (n * (n + 1) / 2);

            int[] aExtended = new int[n + 1];
            System.arraycopy(a, 0, aExtended, 0, n);
            aExtended[n] = a[0];

            int sumMod = 0;
            int sumDiv = 0;

            for (int i = 0; i < n; i++) {
                int diff = (int) (k - aExtended[i] + aExtended[i + 1]);
                sumMod += diff % n;
                if (diff / n >= 0) {
                    sumDiv++;
                }
            }

            if (sumMod != 0 || sumDiv != n) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}

