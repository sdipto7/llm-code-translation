
import java.util.Scanner;

public class s205112814 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] gateCond = new int[m][2];
        for (int i = 0; i < m; i++) {
            gateCond[i][0] = scanner.nextInt();
            gateCond[i][1] = scanner.nextInt();
        }
        int maxUnderTh = Integer.MIN_VALUE;
        int minUpperTh = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            maxUnderTh = Math.max(maxUnderTh, gateCond[i][0]);
            minUpperTh = Math.min(minUpperTh, gateCond[i][1]);
        }
        if (minUpperTh - maxUnderTh >= 0) {
            System.out.println(minUpperTh - maxUnderTh + 1);
        } else {
            System.out.println(0);
        }
        scanner.close();
    }
}

