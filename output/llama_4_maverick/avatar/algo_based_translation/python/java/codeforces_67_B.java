
import java.util.Scanner;

public class codeforces_67_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String u = scanner.nextLine();
        String[] parts = u.split(" ");
        int n = Integer.parseInt(parts[0]);
        int k = Integer.parseInt(parts[1]);
        int[] M = new int[n];
        u = scanner.nextLine();
        parts = u.split(" ");
        for (int i = 0; i < n; i++) {
            M[i] = Integer.parseInt(parts[i]);
        }
        int m = 0;
        for (int j = 0; j < n; j++) {
            int p;
            for (p = 0; p < n; p++) {
                if (M[p] == 0) {
                    System.out.print((p + 1) + " ");
                    break;
                }
            }
            for (int l = 0; l <= p - k; l++) {
                if (l >= 0 && l < M.length) {
                    M[l]--;
                }
            }
            M[p]--;
        }
    }
}

