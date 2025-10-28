
import java.util.Scanner;

public class codeforces_268_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[][] q = new String[n][];
        int count = 0;
        for (int i = 0; i < n; i++) {
            String[] a = scanner.nextLine().split(" ");
            q[i] = a;
        }
        for (String[] j : q) {
            for (String[] k : q) {
                if (k == j) {
                    continue;
                } else if (j[0].equals(k[k.length - 1])) {
                    count++;
                } else {
                    continue;
                }
            }
        }
        System.out.println(count);
    }
}

