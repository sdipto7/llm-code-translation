
import java.util.Arrays;
import java.util.Scanner;

public class s695100304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        for (int i = 0; i < n / 2; i++) {
            int temp = x[i];
            x[i] = x[n - i - 1];
            x[n - i - 1] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(x[i] + " ");
        }
    }
}

