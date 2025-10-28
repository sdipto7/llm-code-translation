
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class s344468705 {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> dp = new ArrayList<>();
        dp.add(Integer.MIN_VALUE);

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
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
    }
}

