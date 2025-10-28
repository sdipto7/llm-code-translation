
import java.util.Scanner;

public class s246280701 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        long ans = (long) 1e10;
        for (int i = 0; i <= 100; i++) {
            long tmp = 0;
            for (int j = 0; j < n; j++) {
                tmp += (long) Math.pow(i - x[j], 2);
            }
            if (tmp < ans) {
                ans = tmp;
            }
        }
        System.out.println(ans);
    }
}

