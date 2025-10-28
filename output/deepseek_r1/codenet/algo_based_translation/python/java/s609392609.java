
import java.util.Scanner;

public class s609392609 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] tInput = scanner.nextLine().trim().split("\\s+");
        int[] t = new int[tInput.length];
        for (int i = 0; i < tInput.length; i++) {
            t[i] = Integer.parseInt(tInput[i]);
        }
        int m = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < m; i++) {
            String[] query = scanner.nextLine().trim().split("\\s+");
            int p = Integer.parseInt(query[0]);
            int x = Integer.parseInt(query[1]);
            int s = 0;
            for (int j = 0; j < t.length; j++) {
                if (j == p - 1) {
                    s += x;
                } else {
                    s += t[j];
                }
            }
            System.out.println(s);
        }
    }
}

