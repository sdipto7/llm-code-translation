
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
        for (int[] cond : gateCond) {
            if (cond[0] > maxUnderTh) {
                maxUnderTh = cond[0];
            }
        }
        
        int minUpperTh = Integer.MAX_VALUE;
        for (int[] cond : gateCond) {
            if (cond[1] < minUpperTh) {
                minUpperTh = cond[1];
            }
        }
        
        if (minUpperTh >= maxUnderTh) {
            System.out.println(minUpperTh - maxUnderTh + 1);
        } else {
            System.out.println(0);
        }
    }
}

