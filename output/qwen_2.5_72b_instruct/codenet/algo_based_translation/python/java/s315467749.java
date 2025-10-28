
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class s315467749 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> S = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            S.add(scanner.nextInt());
        }
        int q = scanner.nextInt();
        List<Integer> T = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            T.add(scanner.nextInt());
        }
        scanner.close();

        int ans = 0;
        for (int i : T) {
            if (i == S.get(n - 1) || i == S.get(0)) {
                ans++;
            } else {
                int left = 0;
                int right = n - 1;
                while (right - left > 1) {
                    int mid = (left + right) / 2;
                    if (S.get(mid) == i) {
                        ans++;
                        break;
                    } else if (S.get(mid) < i) {
                        left = mid;
                    } else {
                        right = mid;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}

