
import java.util.Arrays;
import java.util.Scanner;

public class s934308496 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        System.out.println(calculateResult(n, x, scanner));
    }

    public static int calculateResult(int n, int x, Scanner scanner) {
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = scanner.nextInt();
        }
        Arrays.sort(m);
        int sum = 0;
        for (int num : m) {
            sum += num;
        }
        return n + (x - sum) / m[0];
    }
}

