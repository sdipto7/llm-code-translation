
import java.util.Scanner;

public class codeforces_354_A {

    public static int calculateMinimumEnergy(int n, int L, int R, int QL, int QR, int[] W) {
        int[] sum_el = new int[n + 1];
        sum_el[0] = 0;

        for (int i = 1; i <= n; i++) {
            sum_el[i] = W[i - 1] + sum_el[i - 1];
        }

        int answer = QR * (n - 1) + sum_el[n] * R;

        for (int i = 1; i <= n; i++) {
            int energy = L * sum_el[i] + R * (sum_el[n] - sum_el[i]);

            if (i > (n - i)) {
                energy += (i - (n - i) - 1) * QL;
            } else if ((n - i) > i) {
                energy += ((n - i) - i - 1) * QR;
            }

            if (energy < answer) {
                answer = energy;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int L = Integer.parseInt(input[1]);
        int R = Integer.parseInt(input[2]);
        int QL = Integer.parseInt(input[3]);
        int QR = Integer.parseInt(input[4]);

        int[] W = new int[n];
        String[] weights = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            W[i] = Integer.parseInt(weights[i]);
        }

        int result = calculateMinimumEnergy(n, L, R, QL, QR, W);
        System.out.println(result);
    }
}

