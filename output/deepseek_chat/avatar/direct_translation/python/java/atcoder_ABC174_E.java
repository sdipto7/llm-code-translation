import java.util.*;

public class atcoder_ABC174_E {
    public static boolean check(List<Integer> lis, int k, int mid) {
        for (int i : lis) {
            if (i % mid == 0) {
                k += 1;
            }
            k -= (i / mid);
        }
        return k >= 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> lis = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lis.add(sc.nextInt());
        }
        int a = 1, b = Collections.max(lis);
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
    }
}
