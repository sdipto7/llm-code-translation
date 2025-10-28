
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_350_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> t = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        t.add(0);
        a.add(0);
        for (int i = 0; i < n; i++) {
            t.add(scanner.nextInt());
        }
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        List<Integer> ans = new ArrayList<>();
        int[] cnt = new int[n + 1];
        for (int i : a) {
            cnt[i]++;
        }
        for (int i = 1; i <= n; i++) {
            if (t.get(i) == 1) {
                List<Integer> crt = new ArrayList<>();
                crt.add(i);
                int x = a.get(i);
                while (cnt[x] == 1) {
                    crt.add(x);
                    x = a.get(x);
                }
                if (crt.size() > ans.size()) {
                    ans = new ArrayList<>(crt);
                }
            }
        }
        java.util.Collections.reverse(ans);
        System.out.println(ans.size());
        System.out.println(String.join(" ", ans.stream().map(String::valueOf).toArray(String[]::new)));
    }
}

