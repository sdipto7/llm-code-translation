
import java.util.Scanner;

public class s058944700 {

    public static int calculateMinimumDistance(int n, int k) {
        int tmp;
        int ans;

        if (n > k) {
            tmp = n % k;
            if (tmp >= k - tmp) {
                ans = k - tmp;
            } else {
                ans = tmp;
            }
        } else if (n < k) {
            if (n >= k - n) {
                ans = k - n;
            } else {
                ans = n;
            }
        } else {
            ans = 0;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        int result = calculateMinimumDistance(n, k);
        System.out.println(result);
    }
}

