
import java.util.Scanner;

public class s609392609 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] tInput = scanner.nextLine().split(" ");
        int[] t = new int[tInput.length];
        for (int i = 0; i < tInput.length; i++) {
            t[i] = Integer.parseInt(tInput[i]);
        }
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            int p = scanner.nextInt();
            int x = scanner.nextInt();
            long sum = 0;
            for (int j = 0; j < t.length; j++) {
                if (j == p - 1) {
                    sum += x;
                } else {
                    sum += t[j];
                }
            }
            System.out.println(sum);
        }
    }
}

