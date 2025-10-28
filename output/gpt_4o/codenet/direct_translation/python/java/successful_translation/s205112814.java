
import java.util.Scanner;

public class s205112814 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] gate_cond = new int[m][2];
        for (int i = 0; i < m; i++) {
            gate_cond[i][0] = scanner.nextInt();
            gate_cond[i][1] = scanner.nextInt();
        }
        int max_under_th = Integer.MIN_VALUE;
        int min_upper_th = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            if (gate_cond[i][0] > max_under_th) {
                max_under_th = gate_cond[i][0];
            }
            if (gate_cond[i][1] < min_upper_th) {
                min_upper_th = gate_cond[i][1];
            }
        }
        if (min_upper_th - max_under_th >= 0) {
            System.out.println(min_upper_th - max_under_th + 1);
        } else {
            System.out.println(0);
        }
        scanner.close();
    }
}

