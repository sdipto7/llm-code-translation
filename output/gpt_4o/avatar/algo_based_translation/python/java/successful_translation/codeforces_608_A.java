
import java.util.Scanner;

public class codeforces_608_A {

    public static int calculateMaximumTime(int n, int s, int[][] cases) {
        int c = 0;
        for (int i = 0; i < n; i++) {
            int f = cases[i][0];
            int t = cases[i][1];
            int x = t - (s - f);
            if (x > c) {
                c = x;
            }
        }
        return s + c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int[][] cases = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            cases[i][0] = scanner.nextInt();
            cases[i][1] = scanner.nextInt();
        }
        
        int result = calculateMaximumTime(n, s, cases);
        System.out.println(result);
        
        scanner.close();
    }
}

