
import java.util.Scanner;

public class s205112814 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] gateCond = new int[m][2];
        int maxUnderTh = Integer.MIN_VALUE;
        int minUpperTh = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            gateCond[i][0] = scanner.nextInt();
            gateCond[i][1] = scanner.nextInt();
            maxUnderTh = Math.max(maxUnderTh, gateCond[i][0]);
            minUpperTh = Math.min(minUpperTh, gateCond[i][1]);
        }
        System.out.println(Math.max(0, minUpperTh - maxUnderTh + 1));
    }
}

