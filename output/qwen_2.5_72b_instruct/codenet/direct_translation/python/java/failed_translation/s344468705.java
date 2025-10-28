
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class s344468705 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            solve(sc);
        }
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        ArrayList<Integer> dp = new ArrayList<>();
        dp.add(Integer.MIN_VALUE);
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
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

