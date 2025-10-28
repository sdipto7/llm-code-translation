
import java.util.Scanner;

public class codeforces_11_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.nextLine();
        String[] inputValues = scanner.nextLine().split(" ");
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(inputValues[i]);
        }
        int m = 0;
        for (int a = 0; a < n - 1; a++) {
            int current = x[a];
            int nextVal = x[a + 1];
            if (current >= nextVal) {
                int difference = current - nextVal;
                int q = (difference / d) + 1;
                m += q;
                x[a + 1] = nextVal + q * d;
            }
        }
        System.out.println(m);
    }
}

