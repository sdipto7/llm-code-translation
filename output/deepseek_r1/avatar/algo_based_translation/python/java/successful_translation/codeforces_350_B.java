
import java.util.*;
import java.util.stream.Collectors;

public class codeforces_350_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int[] t = new int[n + 1];
        t[0] = 0;
        String[] tParts = sc.nextLine().split("\\s+");
        for (int i = 1; i <= n; i++) {
            t[i] = Integer.parseInt(tParts[i - 1]);
        }

        int[] a = new int[n + 1];
        a[0] = 0;
        String[] aParts = sc.nextLine().split("\\s+");
        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(aParts[i - 1]);
        }

        List<Integer> ans = new ArrayList<>();
        int[] cnt = new int[n + 1];
        for (int num : a) {
            cnt[num]++;
        }

        for (int i = 1; i <= n; i++) {
            if (t[i] == 1) {
                List<Integer> crt = new ArrayList<>();
                crt.add(i);
                int x = a[i];
                while (cnt[x] == 1) {
                    crt.add(x);
                    x = a[x];
                }
                if (crt.size() > ans.size()) {
                    ans = new ArrayList<>(crt);
                }
            }
        }

        Collections.reverse(ans);
        System.out.println(ans.size());
        System.out.println(ans.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}

