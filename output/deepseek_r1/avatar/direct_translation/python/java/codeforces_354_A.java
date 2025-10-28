import java.util.Scanner;

public class codeforces_354_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstLine = scanner.nextLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int L = Integer.parseInt(firstLine[1]);
        int R = Integer.parseInt(firstLine[2]);
        int QL = Integer.parseInt(firstLine[3]);
        int QR = Integer.parseInt(firstLine[4]);
        String[] parts = scanner.nextLine().split(" ");
        int[] W = new int[n];
        for (int i = 0; i < n; i++) {
            W[i] = Integer.parseInt(parts[i]);
        }
        long[] sumEl = new long[n + 1];
        sumEl[0] = 0;
        for (int i = 1; i <= n; i++) {
            sumEl[i] = sumEl[i - 1] + W[i - 1];
        }
        long answer = (long) QR * (n - 1) + sumEl[n] * R;
        for (int i = 1; i <= n; i++) {
            long energy = L * sumEl[i] + R * (sumEl[n] - sumEl[i]);
            if (i > (n - i)) {
                int penalty = i - (n - i) - 1;
                energy += (long) penalty * QL;
            } else if ((n - i) > i) {
                int penalty = (n - i) - i - 1;
                energy += (long) penalty * QR;
            }
            if (energy < answer) {
                answer = energy;
            }
        }
        System.out.println(answer);
    }
}
