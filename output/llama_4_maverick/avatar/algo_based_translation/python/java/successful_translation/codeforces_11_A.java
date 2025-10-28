
import java.util.Scanner;

public class codeforces_11_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int d = Integer.parseInt(input[1]);
        String[] numbers = scanner.nextLine().split(" ");
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(numbers[i]);
        }
        int m = 0;
        for (int i = 0; i < n - 1; i++) {
            if (x[i] >= x[i + 1]) {
                int q = (x[i] - x[i + 1]) / d + 1;
                m += q;
                x[i + 1] += q * d;
            }
        }
        System.out.println(m);
    }
}

