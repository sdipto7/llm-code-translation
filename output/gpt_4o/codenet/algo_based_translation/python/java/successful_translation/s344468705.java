
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class s344468705 {
    private static final long INF = (long) Math.pow(10, 20);

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Long> dp = new ArrayList<>();
        dp.add(-INF);

        for (int i = 0; i < n; i++) {
            long num = scanner.nextLong();
            num = -num;

            if (num >= dp.get(dp.size() - 1)) {
                dp.add(num);
            } else {
                int idx = Collections.binarySearch(dp, num);
                if (idx < 0) {
                    idx = -(idx + 1);
                }
                dp.set(idx, num);
            }
        }

        System.out.println(dp.size() - 1);
        scanner.close();
    }
}

