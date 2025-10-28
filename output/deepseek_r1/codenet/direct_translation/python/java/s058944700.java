
import java.util.Scanner;

public class s058944700 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int ans;

        if (n > k) {
            int tmp = n % k;
            ans = tmp >= k - tmp ? k - tmp : tmp;
        } else if (n < k) {
            ans = n >= k - n ? k - n : n;
        } else {
            ans = 0;
        }

        System.out.println(ans);
    }
}

