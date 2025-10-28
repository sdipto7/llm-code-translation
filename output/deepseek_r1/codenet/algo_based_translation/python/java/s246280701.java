
import java.util.Scanner;

public class s246280701 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] input = scanner.nextLine().split(" ");
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(input[i]);
        }
        long ans = 10000000000L;
        for (int i = 0; i <= 100; i++) {
            int[] tmp = new int[n];
            for (int j = 0; j < n; j++) {
                tmp[j] = (i - x[j]) * (i - x[j]);
            }
            int sumTmp = 0;
            for (int num : tmp) {
                sumTmp += num;
            }
            if (sumTmp < ans) {
                ans = sumTmp;
            }
        }
        System.out.println(ans);
    }
}

