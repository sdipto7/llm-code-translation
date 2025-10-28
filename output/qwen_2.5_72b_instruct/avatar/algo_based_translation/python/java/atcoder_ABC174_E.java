
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class atcoder_ABC174_E {
    public static boolean check(List<Integer> lis, int k, int mid) {
        for (int i : lis) {
            if (i % mid == 0) {
                k++;
            }
            k -= (i / mid);
        }
        return k >= 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Integer> lis = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lis.add(scanner.nextInt());
        }
        int a = 1;
        int b = Integer.MIN_VALUE;
        for (int num : lis) {
            if (num > b) {
                b = num;
            }
        }
        int ans = b;
        while (a <= b) {
            int mid = (a + b) / 2;
            if (check(lis, k, mid)) {
                ans = mid;
                b = mid - 1;
            } else {
                a = mid + 1;
            }
        }
        System.out.println(ans);
        scanner.close();
    }
}

