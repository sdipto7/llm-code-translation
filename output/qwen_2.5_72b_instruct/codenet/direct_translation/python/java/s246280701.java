import java.util.Scanner;

public class s246280701 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        for (int j = 0; j < n; j++) {
            x[j] = scanner.nextInt();
        }
        int ans = 1000000000;
        for (int i = 0; i <= 100; i++) {
            int tmpSum = 0;
            for (int j = 0; j < n; j++) {
                tmpSum += Math.pow(i - x[j], 2);
            }
            if (tmpSum < ans) {
                ans = tmpSum;
            }
        }
        System.out.println(ans);
    }
}
